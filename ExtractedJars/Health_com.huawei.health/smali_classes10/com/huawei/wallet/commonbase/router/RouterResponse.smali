.class public Lcom/huawei/wallet/commonbase/router/RouterResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->b:Z

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->c:Ljava/util/Map;

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->e:Z

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->b:Z

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->c:Ljava/util/Map;

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->e:Z

    .line 28
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->a:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->d:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 67
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 55
    iput-boolean p1, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->e:Z

    .line 56
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->a:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->d:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 17
    iput-boolean p1, p0, Lcom/huawei/wallet/commonbase/router/RouterResponse;->b:Z

    .line 18
    return-void
.end method

.class Lcom/huawei/health/sns/server/im/SNSIMCenter$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/azf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/SNSIMCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/server/im/SNSIMCenter;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 235
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 237
    invoke-static {p1}, Lo/bcd;->a(Ljava/lang/String;)V

    .line 239
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 241
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 242
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 243
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 244
    invoke-static {p1, v2}, Lo/azl;->d(Ljava/lang/String;Ljava/util/Set;)V

    .line 245
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/azd$c;Lo/azd$a;)V
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0, p1, p2}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lcom/huawei/health/sns/server/im/SNSIMCenter;Lo/azd$c;Lo/azd$a;)V

    .line 263
    return-void
.end method

.method public c(Lo/azd$a;)V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lcom/huawei/health/sns/server/im/SNSIMCenter;Lo/azd$a;)V

    .line 251
    return-void
.end method

.method public e()V
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d()V

    .line 257
    return-void
.end method

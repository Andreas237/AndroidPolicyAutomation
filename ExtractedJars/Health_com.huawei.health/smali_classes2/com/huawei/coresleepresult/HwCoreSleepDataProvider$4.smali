.class Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;


# direct methods
.method constructor <init>(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 245
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get user info errCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",errMsg = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 225
    const-string v0, "HwCoreSleepDataProvider"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get user info data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 227
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 228
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiUserInfo;

    .line 229
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;I)I

    .line 230
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    invoke-static {v0}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->e(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;I)I

    goto :goto_0

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;I)I

    .line 235
    :goto_0
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserInfo;->getAge()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->d(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;I)I

    .line 236
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    invoke-static {v0}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->a(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    invoke-static {v0}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->a(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;)I

    move-result v0

    const/16 v1, 0x82

    if-le v0, v1, :cond_2

    .line 237
    :cond_1
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;->c:Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    const/16 v1, 0x1e

    invoke-static {v0, v1}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->d(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;I)I

    .line 241
    :cond_2
    return-void
.end method

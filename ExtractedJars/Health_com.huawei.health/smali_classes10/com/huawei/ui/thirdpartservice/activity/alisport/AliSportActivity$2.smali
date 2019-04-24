.class Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$2;->d:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 5

    .line 217
    const-string v0, "AliSportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doAliAuth thirdAuthorization isSuccess is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    if-eqz p3, :cond_0

    .line 219
    const-class v0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;

    invoke-static {p2, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;

    .line 220
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->getThirdAuthToken()Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$2;->d:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;I)V

    .line 222
    return-void

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$2;->d:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;I)V

    .line 226
    return-void
.end method

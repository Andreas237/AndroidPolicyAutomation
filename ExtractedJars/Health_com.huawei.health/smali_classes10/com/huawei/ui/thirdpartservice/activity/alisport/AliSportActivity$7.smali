.class Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->b()V
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
.field final synthetic a:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$7;->a:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 4

    .line 274
    const-string v0, "AliSportActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doCancelThirdAuthorization isSuccess = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    if-eqz p3, :cond_0

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$7;->a:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;I)V

    goto :goto_0

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$7;->a:Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;I)V

    .line 280
    :goto_0
    return-void
.end method

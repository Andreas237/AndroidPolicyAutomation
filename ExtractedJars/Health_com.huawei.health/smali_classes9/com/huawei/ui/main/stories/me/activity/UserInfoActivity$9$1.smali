.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;->onSuccess(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;)V
    .locals 0

    .line 1015
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9$1;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Boolean;Ljava/lang/String;Z)V
    .locals 4

    .line 1018
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save operationResult onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1019
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 1015
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9$1;->b(Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-void
.end method

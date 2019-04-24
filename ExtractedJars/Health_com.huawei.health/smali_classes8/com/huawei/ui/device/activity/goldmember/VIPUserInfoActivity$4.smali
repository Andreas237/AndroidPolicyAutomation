.class Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$4;->b:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$4;->b:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d:Lo/eoe;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$4;->b:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d:Lo/eoe;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$4;->b:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$4;->b:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->u(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/eoe;->d(Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V

    goto :goto_0

    .line 321
    :cond_0
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHuaweiGoldMemberInteractors is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    return-void

    .line 324
    :goto_0
    return-void
.end method

.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)V
    .locals 0

    .line 996
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iput p2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 999
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;->a:I

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setHeight(I)V

    .line 1000
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 1001
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->u(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 1002
    return-void
.end method

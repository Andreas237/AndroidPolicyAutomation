.class Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public callback(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 4

    .line 115
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\uff0cretMsg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",memLevel = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const-string v0, "-1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RetCode.FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->sendEmptyMessage(I)Z

    .line 120
    return-void

    .line 122
    :cond_0
    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "200"

    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    :cond_1
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RetCode.SUCCESS! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 127
    :cond_2
    const-string v0, "301001"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->sendEmptyMessage(I)Z

    .line 129
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "response Failure not huawei phone!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void

    .line 132
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->sendEmptyMessage(I)Z

    .line 133
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "response Failure not huawei phone!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void

    .line 136
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->sendEmptyMessage(I)Z

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->a(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)I

    move-result v0

    if-nez v0, :cond_4

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    const-class v1, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e(Ljava/lang/Class;)V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->finish()V

    goto :goto_1

    .line 141
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->a(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;->c:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->finish()V

    .line 144
    :cond_5
    :goto_1
    return-void
.end method

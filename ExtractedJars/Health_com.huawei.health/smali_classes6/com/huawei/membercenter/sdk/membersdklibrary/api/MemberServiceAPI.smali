.class public Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;,
        Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static activeMember(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V
    .locals 1

    .line 93
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V

    .line 94
    return-void
.end method

.method public static enterPhoneServiceApk(Landroid/content/Context;)V
    .locals 1

    .line 104
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a(Landroid/content/Context;)V

    .line 105
    return-void
.end method

.method public static queryMemberStatus(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V
    .locals 1

    .line 69
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V

    .line 70
    return-void
.end method

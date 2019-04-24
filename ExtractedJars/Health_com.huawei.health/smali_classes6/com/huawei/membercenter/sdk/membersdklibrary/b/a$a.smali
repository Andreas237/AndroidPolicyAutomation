.class Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;

.field private c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V
    .locals 0

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;->a:Landroid/content/Context;

    .line 155
    iput-object p2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;->c:Landroid/os/Bundle;

    .line 156
    iput-object p3, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;

    .line 157
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 165
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/b;

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;->c:Landroid/os/Bundle;

    invoke-direct {v0, v1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/b;-><init>(Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/b;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;

    move-result-object v4

    .line 166
    const-string v0, "200"

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->c()Lcom/google/gson/JsonObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 168
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 169
    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->c()Lcom/google/gson/JsonObject;

    move-result-object v0

    const-class v1, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;

    invoke-virtual {v5, v0, v1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;

    .line 171
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 172
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->getGradeId()I

    move-result v3

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;->callback(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;->callback(Ljava/lang/String;Ljava/lang/String;I)V

    .line 177
    :goto_0
    goto :goto_1

    .line 179
    :cond_1
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;->callback(Ljava/lang/String;Ljava/lang/String;I)V

    .line 181
    :goto_1
    return-void
.end method

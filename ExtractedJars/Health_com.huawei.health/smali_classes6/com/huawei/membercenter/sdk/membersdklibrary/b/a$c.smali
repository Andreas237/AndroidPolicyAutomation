.class Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;
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
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

.field private c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;->a:Landroid/content/Context;

    .line 72
    iput-object p2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;->c:Landroid/os/Bundle;

    .line 73
    iput-object p3, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

    .line 74
    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 78
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/c;

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;->c:Landroid/os/Bundle;

    invoke-direct {v0, v1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/c;-><init>(Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/c;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;

    move-result-object v4

    .line 79
    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

    const-string v1, "-1"

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;->callback(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;)V

    .line 81
    return-void

    .line 83
    :cond_0
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 84
    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->a()Ljava/lang/String;

    move-result-object v6

    .line 85
    move-object v7, v6

    const/4 v8, -0x1

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "300001"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "300002"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "0"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x2

    :cond_1
    :goto_0
    packed-switch v8, :pswitch_data_0

    goto :goto_1

    .line 89
    :pswitch_0
    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->c()Lcom/google/gson/JsonObject;

    move-result-object v0

    const-class v1, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;

    invoke-virtual {v5, v0, v1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;

    .line 91
    if-eqz v9, :cond_2

    invoke-virtual {v9}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getMemLevel()I

    move-result v0

    invoke-virtual {v9}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getIntentLevel()I

    move-result v1

    if-ge v0, v1, :cond_2

    const-string v0, "300001"

    .line 92
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 93
    const-string v6, "L300001"

    .line 95
    :cond_2
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v6, v1, v9}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;->callback(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;)V

    .line 96
    goto :goto_2

    .line 99
    :goto_1
    invoke-virtual {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;->c()Lcom/google/gson/JsonObject;

    move-result-object v0

    const-class v1, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberInfoResponse;

    invoke-virtual {v5, v0, v1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberInfoResponse;

    .line 101
    const-string v11, ""

    .line 102
    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    .line 103
    invoke-virtual {v10}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberInfoResponse;->getReason()Ljava/lang/String;

    move-result-object v11

    .line 105
    :cond_3
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v6, v11, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;->callback(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;)V

    .line 129
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_2
        0x59c21bde -> :sswitch_0
        0x59c21bdf -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

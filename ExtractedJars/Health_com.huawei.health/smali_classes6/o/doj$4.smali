.class Lo/doj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/doj;->d(Lo/dod$e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/doj;

.field final synthetic e:Lo/dod$e$b;


# direct methods
.method constructor <init>(Lo/doj;Lo/dod$e$b;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/doj$4;->b:Lo/doj;

    iput-object p2, p0, Lo/doj$4;->e:Lo/dod$e$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 124
    const-string v0, "HiHealthReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lo/doj$4;->e:Lo/dod$e$b;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/doe;->e(Lo/dod$e$b;I)V

    .line 126
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 8

    .line 73
    const-string v0, "TimeEat_HiHealthReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    if-eqz p2, :cond_6

    .line 75
    const/4 v4, 0x0

    .line 77
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 80
    goto :goto_0

    .line 78
    :catch_0
    move-exception v5

    .line 79
    const-string v0, "HiHealthReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData data ClassCastException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 82
    :cond_0
    const-string v0, "HiHealthReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData data size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lo/doj$4;->e:Lo/dod$e$b;

    if-eqz v0, :cond_1

    .line 84
    iget-object v0, p0, Lo/doj$4;->e:Lo/dod$e$b;

    const v1, 0x49443

    invoke-interface {v0, v1}, Lo/dod$e$b;->d(I)V

    .line 86
    :cond_1
    return-void

    .line 89
    :cond_2
    new-instance v5, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v5}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 91
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiUserInfo;

    .line 93
    if-nez v6, :cond_4

    .line 94
    const-string v0, "HiHealthReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiUserInfo = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lo/doj$4;->e:Lo/dod$e$b;

    if-eqz v0, :cond_3

    .line 96
    iget-object v0, p0, Lo/doj$4;->e:Lo/dod$e$b;

    const v1, 0x49443

    invoke-interface {v0, v1}, Lo/dod$e$b;->d(I)V

    .line 98
    :cond_3
    return-void

    .line 101
    :cond_4
    invoke-virtual {v5, v6}, Lcom/huawei/up/model/UserInfomation;->loadAccountData(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 104
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 105
    iget-object v0, p0, Lo/doj$4;->b:Lo/doj;

    invoke-static {v0}, Lo/doj;->d(Lo/doj;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dou;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 107
    :cond_5
    iget-object v0, p0, Lo/doj$4;->b:Lo/doj;

    invoke-static {v0}, Lo/doj;->d(Lo/doj;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dou;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 109
    :goto_1
    invoke-virtual {v5, v7}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v5, v6}, Lcom/huawei/up/model/UserInfomation;->loadAccountExtData(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 115
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->transSelf2METRIC()V

    .line 117
    iget-object v0, p0, Lo/doj$4;->e:Lo/dod$e$b;

    invoke-static {v0, v5}, Lo/doe;->d(Lo/dod$e$b;Lcom/huawei/up/model/UserInfomation;)V

    .line 118
    const-string v0, "TimeEat_HiHealthReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    :cond_6
    return-void
.end method

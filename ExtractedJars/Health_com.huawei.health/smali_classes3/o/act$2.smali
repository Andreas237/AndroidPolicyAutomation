.class Lo/act$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/act;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/act;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/act;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/act$2;->c:Lo/act;

    iput-object p2, p0, Lo/act$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 113
    invoke-static {}, Lo/act;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getOtherUserData--:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/act$2;->c:Lo/act;

    invoke-static {v3}, Lo/act;->e(Lo/act;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v6

    .line 115
    iget-object v0, p0, Lo/act$2;->c:Lo/act;

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lo/act;->d(Lo/act;Lcom/huawei/hihealth/HiUserPreference;Z)V

    .line 116
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo_expand"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 117
    iget-object v0, p0, Lo/act$2;->c:Lo/act;

    const/4 v1, 0x1

    invoke-static {v0, v7, v1}, Lo/act;->d(Lo/act;Lcom/huawei/hihealth/HiUserPreference;Z)V

    .line 119
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo_base"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v8

    .line 120
    if-eqz v6, :cond_1

    .line 121
    if-nez v8, :cond_0

    .line 122
    invoke-static {}, Lo/act;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOtherUserData hiUserPreferenceBase is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lo/act$2;->c:Lo/act;

    invoke-static {v0}, Lo/act;->a(Lo/act;)V

    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v8}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 126
    iget-object v0, p0, Lo/act$2;->c:Lo/act;

    invoke-static {v0}, Lo/act;->a(Lo/act;)V

    goto :goto_0

    .line 130
    :cond_1
    invoke-static {}, Lo/act;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOtherUserData hiUserPreference is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/act$2;->c:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 133
    iget-object v0, p0, Lo/act$2;->c:Lo/act;

    iget-object v1, p0, Lo/act$2;->c:Lo/act;

    invoke-static {v1}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/act;->c(Lo/acu;)V

    .line 135
    :cond_3
    iget-object v0, p0, Lo/act$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_5

    .line 137
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0}, Lo/acs;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 138
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, Lo/act$2$2;

    invoke-direct {v5, p0}, Lo/act$2$2;-><init>(Lo/act$2;)V

    const-wide/16 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/acs;->d(JJLo/egg;)V

    goto :goto_1

    .line 146
    :cond_4
    iget-object v0, p0, Lo/act$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 151
    :cond_5
    :goto_1
    return-void
.end method

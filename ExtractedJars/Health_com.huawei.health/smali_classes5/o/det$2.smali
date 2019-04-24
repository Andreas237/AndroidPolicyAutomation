.class final Lo/det$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/det;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lo/det$2;->b:Ljava/lang/String;

    iput-object p2, p0, Lo/det$2;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/det$2;->a:Landroid/content/Context;

    iput-object p4, p0, Lo/det$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 252
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;-><init>()V

    .line 253
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "intelligent_home_linkage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/det$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/det$2;->e:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    invoke-virtual {v4, v5}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;->setCustomDefine(Ljava/util/Map;)V

    .line 256
    iget-object v0, p0, Lo/det$2;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v6

    .line 257
    invoke-virtual {v6, v4}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    move-result-object v7

    .line 258
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 259
    const-string v0, "FitnessMgrSharePreference"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadUserData rsp : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    :cond_0
    iget-object v0, p0, Lo/det$2;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v8

    .line 262
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 263
    const-string v0, "FitnessMgrSharePreference"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 265
    :cond_1
    iget-object v0, p0, Lo/det$2;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/det$2;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/det$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v8, v0, v1, v2}, Lo/dqi;->b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 267
    :goto_0
    return-void
.end method

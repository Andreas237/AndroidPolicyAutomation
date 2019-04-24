.class Lo/dtv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dtv;->c(ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

.field final synthetic b:I

.field final synthetic c:Lo/dtv;

.field final synthetic d:Ljava/util/Map;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/dtv;ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/dtv$3;->c:Lo/dtv;

    iput p2, p0, Lo/dtv$3;->b:I

    iput-object p3, p0, Lo/dtv$3;->a:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    iput-object p4, p0, Lo/dtv$3;->d:Ljava/util/Map;

    iput-object p5, p0, Lo/dtv$3;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 3

    .line 131
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCallBackFail i = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 9

    .line 103
    const-string v0, "PLGACHIEVE_AchievePuller"

    const-string v1, "GET KEY SUCCESS"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dtv$3;->b:I

    invoke-static {v1}, Lo/dtz;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 105
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pullData,url ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lo/dtv$3;->a:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    iget-object v1, p0, Lo/dtv$3;->d:Ljava/util/Map;

    invoke-static {v0, v1}, Lo/dtz;->a(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v4

    .line 108
    iget-object v0, p0, Lo/dtv$3;->a:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-static {v0}, Lo/dtz;->d(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;)Ljava/util/HashMap;

    move-result-object v5

    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 110
    new-instance v0, Lo/dtv$3$4;

    invoke-direct {v0, p0, v6, v7}, Lo/dtv$3$4;-><init>(Lo/dtv$3;J)V

    invoke-static {v3, v4, v5, v0}, Lo/dtp;->b(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lo/dto;)I

    move-result v8

    .line 125
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pullData ret="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :cond_0
    return-void
.end method

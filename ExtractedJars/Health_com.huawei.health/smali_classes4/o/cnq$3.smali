.class Lo/cnq$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->c(Lcom/huawei/hihealth/HiUserInfo;Lo/cla;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hihealth/HiUserInfo;

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lo/crd;

.field final synthetic d:J

.field final synthetic e:Lo/cla;

.field final synthetic i:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;Lcom/huawei/hihealth/HiUserInfo;Lo/crd;Ljava/util/ArrayList;Lo/cla;J)V
    .locals 0

    .line 1133
    iput-object p1, p0, Lo/cnq$3;->i:Lo/cnq;

    iput-object p2, p0, Lo/cnq$3;->a:Lcom/huawei/hihealth/HiUserInfo;

    iput-object p3, p0, Lo/cnq$3;->c:Lo/crd;

    iput-object p4, p0, Lo/cnq$3;->b:Ljava/util/ArrayList;

    iput-object p5, p0, Lo/cnq$3;->e:Lo/cla;

    iput-wide p6, p0, Lo/cnq$3;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1136
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData userInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$3;->a:Lcom/huawei/hihealth/HiUserInfo;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " package is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$3;->c:Lo/crd;

    .line 1137
    invoke-virtual {v2}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 1136
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1138
    iget-object v0, p0, Lo/cnq$3;->i:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cnv;->c(Landroid/content/Context;)Lo/cnv;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$3;->a:Lcom/huawei/hihealth/HiUserInfo;

    iget-object v2, p0, Lo/cnq$3;->c:Lo/crd;

    invoke-virtual {v0, v1, v2}, Lo/cnv;->d(Lcom/huawei/hihealth/HiUserInfo;Lo/crd;)J

    move-result-wide v6

    .line 1139
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData ans = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1141
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 1142
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData() success , ans = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1143
    iget-object v0, p0, Lo/cnq$3;->i:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 1144
    iget-object v0, p0, Lo/cnq$3;->i:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->b(Lo/cnq;)Lo/cun;

    move-result-object v0

    const-string v1, "setUserData"

    iget-object v2, p0, Lo/cnq$3;->c:Lo/crd;

    const/16 v3, 0x64

    invoke-virtual {v0, v3, v1, v2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 1145
    iget-object v0, p0, Lo/cnq$3;->b:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1146
    iget-object v0, p0, Lo/cnq$3;->e:Lo/cla;

    long-to-int v1, v6

    iget-object v2, p0, Lo/cnq$3;->b:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    .line 1147
    iget-object v0, p0, Lo/cnq$3;->i:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/cnt;->c(Landroid/content/Context;I)V

    goto :goto_0

    .line 1149
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData() fail , ans = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1150
    iget-object v0, p0, Lo/cnq$3;->e:Lo/cla;

    iget-object v1, p0, Lo/cnq$3;->b:Ljava/util/ArrayList;

    const/16 v2, 0xe

    invoke-static {v0, v2, v1}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1152
    :goto_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData() end! cost time is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/cnq$3;->d:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1153
    return-void
.end method

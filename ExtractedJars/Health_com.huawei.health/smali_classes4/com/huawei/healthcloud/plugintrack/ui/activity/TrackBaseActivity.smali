.class public abstract Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;


# static fields
.field private static b:[Ljava/lang/String;

.field private static h:[Ljava/lang/String;

.field private static i:[Ljava/lang/String;


# instance fields
.field protected a:Lo/cco;

.field private c:Z

.field protected d:Landroid/os/Handler;

.field protected e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 31
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->b:[Ljava/lang/String;

    .line 37
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->h:[Ljava/lang/String;

    .line 44
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->i:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->a:Lo/cco;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 98
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->e()Lo/cco;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->a:Lo/cco;

    .line 100
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->a:Lo/cco;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->a:Lo/cco;

    invoke-interface {v0}, Lo/cco;->d()V

    .line 103
    :cond_0
    return-void
.end method

.method private d([Ljava/lang/String;)V
    .locals 9

    .line 171
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 172
    :cond_0
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkPermission, permissions is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    return-void

    .line 175
    :cond_1
    invoke-static {p0, p1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v4

    .line 176
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkPermission, hasPermission ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ",permissions are "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    if-nez v4, :cond_5

    .line 178
    move-object v5, p1

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_4

    aget-object v8, v5, v7

    .line 179
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 181
    :cond_2
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 182
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 178
    :cond_3
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 186
    :cond_4
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;)V

    invoke-static {p0, p1, v0}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    goto :goto_2

    .line 202
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 203
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 206
    :cond_6
    :goto_2
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected abstract b()V
.end method

.method protected abstract e()Lo/cco;
.end method

.method protected g()Z
    .locals 1

    .line 237
    const/4 v0, 0x1

    return v0
.end method

.method protected h()Z
    .locals 1

    .line 242
    const/4 v0, 0x1

    return v0
.end method

.method public i()V
    .locals 4

    .line 109
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 111
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 112
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 116
    :cond_0
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNeedLocationPermission ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->g()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " , isNeedStorgePermission() = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 117
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 116
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->c:Z

    if-eqz v0, :cond_2

    .line 119
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->i:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d([Ljava/lang/String;)V

    goto :goto_0

    .line 122
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 123
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 127
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 128
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->b:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d([Ljava/lang/String;)V

    goto :goto_0

    .line 129
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 130
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->h:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d([Ljava/lang/String;)V

    goto :goto_0

    .line 131
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 132
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->i:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d([Ljava/lang/String;)V

    goto :goto_0

    .line 134
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 135
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 140
    :cond_6
    :goto_0
    return-void
.end method

.method protected k()Z
    .locals 1

    .line 93
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 56
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 58
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 59
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->finish()V

    .line 60
    return-void

    .line 63
    :cond_0
    iput-object p0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    .line 65
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    .line 86
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/dbf;->n(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->c:Z

    .line 87
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->i()V

    .line 89
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->b()V

    .line 90
    return-void
.end method

.method public onLowMemory()V
    .locals 0

    .line 225
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onLowMemory()V

    .line 226
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 215
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 216
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 150
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 152
    invoke-static {p0, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult : HasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 155
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 159
    :cond_0
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult : finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->finish()V

    .line 163
    :cond_1
    :goto_0
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 210
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 211
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 220
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 221
    return-void
.end method

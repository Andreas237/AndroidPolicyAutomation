.class Lo/esa$5;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/esa;


# direct methods
.method constructor <init>(Lo/esa;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lo/esa$5;->c:Lo/esa;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 173
    if-eqz p2, :cond_5

    .line 174
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 175
    if-eqz v4, :cond_5

    .line 178
    const-string v0, "com.huawei.plugin.account.login"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 181
    invoke-static {}, Lo/esa;->d()I

    move-result v5

    .line 182
    const-string v0, "Track_InitRuncourseUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_LOGIN_SUCCESSFUL getRunCourseState:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const/4 v0, -0x2

    if-eq v0, v5, :cond_0

    const/4 v0, -0x1

    if-ne v0, v5, :cond_1

    .line 187
    :cond_0
    return-void

    .line 191
    :cond_1
    const/4 v0, 0x0

    if-gt v0, v5, :cond_2

    const/4 v0, 0x5

    if-gt v5, v0, :cond_2

    .line 192
    iget-object v0, p0, Lo/esa$5;->c:Lo/esa;

    add-int/lit8 v1, v5, 0x1

    invoke-static {v0, v1}, Lo/esa;->a(Lo/esa;I)V

    .line 193
    iget-object v0, p0, Lo/esa$5;->c:Lo/esa;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/esa;->e(Lo/esa;IJ)V

    .line 197
    :cond_2
    const/4 v0, 0x5

    if-le v5, v0, :cond_3

    .line 198
    iget-object v0, p0, Lo/esa$5;->c:Lo/esa;

    const/4 v1, -0x2

    invoke-static {v0, v1}, Lo/esa;->a(Lo/esa;I)V

    .line 199
    const-string v0, "Track_InitRuncourseUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Over max try times"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :cond_3
    goto :goto_0

    :cond_4
    const-string v0, "com.huawei.plugin.account.logout"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 204
    const-string v0, "Track_InitRuncourseUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_LOGOUT_SUCCESSFUL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget-object v0, p0, Lo/esa$5;->c:Lo/esa;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/esa;->a(Lo/esa;I)V

    .line 209
    :cond_5
    :goto_0
    return-void
.end method

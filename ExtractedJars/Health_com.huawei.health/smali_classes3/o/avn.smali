.class public Lo/avn;
.super Lo/avm;
.source "SourceFile"


# instance fields
.field private g:J

.field private l:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 142
    invoke-direct {p0, p1}, Lo/avm;-><init>(Ljava/lang/String;)V

    .line 143
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 163
    invoke-super {p0}, Lo/avm;->a()V

    .line 165
    const-string v0, "GrpListChgMsgAdpt"

    const-string v1, "parse group member list change push message."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const/4 v2, 0x0

    .line 169
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lo/avn;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    .line 170
    const-string v0, "GroupMemListChangeNotify"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 178
    goto :goto_0

    .line 172
    :catch_0
    move-exception v3

    .line 174
    const-string v0, "GrpListChgMsgAdpt"

    const-string v1, "parse exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parse GroupMemListChangeNotify exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 177
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 176
    invoke-static {v0}, Lo/bpj;->d(Ljava/lang/String;)V

    .line 179
    :goto_0
    if-eqz v2, :cond_0

    .line 181
    const-string v0, "pushUID"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avn;->d:J

    .line 182
    const-string v0, "grpID"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avn;->g:J

    .line 183
    const-string v0, "version"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avn;->l:Ljava/lang/String;

    .line 185
    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 5

    .line 201
    invoke-super {p0, p1}, Lo/avm;->a(Landroid/content/Context;)V

    .line 203
    new-instance v0, Lo/atk;

    invoke-direct {v0}, Lo/atk;-><init>()V

    iget-wide v1, p0, Lo/avn;->g:J

    invoke-virtual {v0, v1, v2}, Lo/atk;->e(J)Ljava/lang/String;

    move-result-object v3

    .line 205
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    new-instance v4, Lo/atg;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/atg;-><init>(Landroid/os/Handler;)V

    .line 209
    iget-wide v0, p0, Lo/avn;->g:J

    invoke-virtual {v4, v0, v1}, Lo/atg;->a(J)V

    .line 210
    goto :goto_0

    .line 211
    :cond_0
    iget-object v0, p0, Lo/avn;->l:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 213
    new-instance v0, Lo/avd;

    invoke-direct {v0, p1, p0}, Lo/avd;-><init>(Landroid/content/Context;Lo/avn;)V

    invoke-virtual {v0}, Lo/avd;->b()V

    .line 215
    :cond_1
    :goto_0
    return-void
.end method

.method public b()J
    .locals 2

    .line 71
    iget-wide v0, p0, Lo/avn;->g:J

    return-wide v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 6

    .line 223
    invoke-virtual {p0}, Lo/avn;->a()V

    .line 224
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/avn;->g:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v4

    .line 225
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 226
    const-string v0, "GrpListChgMsgAdpt"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GrpMemList Change Push Notification message.group is null:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    if-eqz v4, :cond_1

    .line 231
    const-class v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-virtual {v5, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 232
    const-string v0, "EXTRA_GROUP_ID"

    iget-wide v1, p0, Lo/avn;->g:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    goto :goto_1

    .line 237
    :cond_1
    const-class v0, Lcom/huawei/health/sns/ui/group/HealthGroupListActivity;

    invoke-virtual {v5, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 239
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    iget-wide v1, p0, Lo/avn;->g:J

    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    invoke-virtual {v0, v1, v2, v3}, Lo/auu;->a(J[I)V

    .line 242
    :goto_1
    const-string v0, "activity_open_from_notification_flag"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 243
    invoke-virtual {p0, p1, v5}, Lo/avn;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 244
    invoke-super {p0, p1}, Lo/avm;->b(Landroid/content/Context;)V

    .line 245
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lo/avn;->p:Ljava/util/List;

    return-object v0
.end method

.method public c(Landroid/content/Context;)V
    .locals 2

    .line 190
    invoke-virtual {p0}, Lo/avn;->f()V

    .line 191
    iget-object v0, p0, Lo/avn;->i:Lo/aye;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/aye;->c(Z)V

    .line 192
    invoke-super {p0, p1}, Lo/avm;->c(Landroid/content/Context;)V

    .line 193
    return-void
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 151
    if-eqz p1, :cond_0

    .line 153
    iget-object v0, p0, Lo/avn;->i:Lo/aye;

    invoke-virtual {v0, p1}, Lo/aye;->c(Landroid/graphics/Bitmap;)V

    .line 155
    :cond_0
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lo/avn;->n:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 111
    iput-object p1, p0, Lo/avn;->p:Ljava/util/List;

    .line 112
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lo/avn;->n:Ljava/lang/String;

    .line 133
    return-void
.end method

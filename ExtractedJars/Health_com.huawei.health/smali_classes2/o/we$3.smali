.class Lo/we$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/Response$ErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/we;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/wo;

.field final synthetic c:Landroid/os/Bundle;

.field final synthetic d:Lo/we;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/we;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Context;Lo/wo;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lo/we$3;->d:Lo/we;

    iput-object p2, p0, Lo/we$3;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/we$3;->c:Landroid/os/Bundle;

    iput-object p4, p0, Lo/we$3;->e:Landroid/content/Context;

    iput-object p5, p0, Lo/we$3;->b:Lo/wo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/android/volley/VolleyError;)V
    .locals 6

    .line 180
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "PSocial_GetCloudData"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "Volley error "

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getJSon Response tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/we$3;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Error message :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/android/volley/VolleyError;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "   network response :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Lcom/android/volley/VolleyError;->networkResponse:Lcom/android/volley/NetworkResponse;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget-object v0, p0, Lo/we$3;->c:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 184
    iget-object v0, p0, Lo/we$3;->d:Lo/we;

    iget-object v1, p0, Lo/we$3;->e:Landroid/content/Context;

    iget-object v2, p0, Lo/we$3;->a:Ljava/lang/String;

    iget-object v3, p0, Lo/we$3;->c:Landroid/os/Bundle;

    const-string v4, "post_id"

    .line 185
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 184
    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/we;->e(Lo/we;Landroid/content/Context;Ljava/lang/String;JI)V

    .line 187
    :cond_0
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter Response.ErrorListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lo/we$3;->b:Lo/wo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 190
    iget-object v0, p0, Lo/we$3;->b:Lo/wo;

    invoke-interface {v0}, Lo/wo;->e()V

    .line 191
    iget-object v0, p0, Lo/we$3;->b:Lo/wo;

    invoke-interface {v0}, Lo/wo;->b()V

    .line 193
    :cond_1
    return-void
.end method

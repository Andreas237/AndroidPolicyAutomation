.class Lo/act$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/act;->b(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lo/act;

.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/act;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lo/act$5;->b:Lo/act;

    iput-object p2, p0, Lo/act$5;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lo/act$5;->a:Z

    iput-object p4, p0, Lo/act$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 325
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 327
    iget-object v0, p0, Lo/act$5;->b:Lo/act;

    iget-object v1, p0, Lo/act$5;->c:Ljava/lang/String;

    invoke-static {v0, v7, v1}, Lo/act;->b(Lo/act;Lcom/huawei/hihealth/HiUserPreference;Ljava/lang/String;)Z

    move-result v8

    .line 328
    iget-object v0, p0, Lo/act$5;->b:Lo/act;

    invoke-static {v0}, Lo/act;->e(Lo/act;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/act$5;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lo/act$5;->b:Lo/act;

    invoke-static {v0}, Lo/act;->e(Lo/act;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/act$5;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    :cond_0
    iget-object v0, p0, Lo/act$5;->b:Lo/act;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/act$5;->b:Lo/act;

    if-nez v8, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-static {v2, v3}, Lo/act;->a(Lo/act;Z)Ljava/lang/String;

    move-result-object v2

    iget-boolean v5, p0, Lo/act$5;->a:Z

    if-nez v8, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static/range {v0 .. v6}, Lo/act;->a(Lo/act;Landroid/content/Context;Ljava/lang/String;Lo/acu;ZZZ)V

    .line 332
    iget-object v0, p0, Lo/act$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 333
    return-void
.end method

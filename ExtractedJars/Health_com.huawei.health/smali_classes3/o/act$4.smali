.class Lo/act$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/act;->e(Lo/acu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/acu;

.field final synthetic b:Lo/act;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/act;Lo/acu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lo/act$4;->b:Lo/act;

    iput-object p2, p0, Lo/act$4;->a:Lo/acu;

    iput-object p3, p0, Lo/act$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 273
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    if-nez v0, :cond_0

    .line 274
    invoke-static {}, Lo/act;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainUser is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v0}, Lo/act;->b(Lo/act;)V

    .line 277
    :cond_0
    const-string v7, ""

    .line 278
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 279
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v7

    .line 281
    :cond_1
    iget-object v0, p0, Lo/act$4;->a:Lo/acu;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/act$4;->a:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 282
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v0}, Lo/act;->e(Lo/act;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/act$4;->a:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/acu;

    .line 283
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v9

    .line 284
    const/4 v10, 0x0

    .line 285
    if-nez v8, :cond_3

    .line 287
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v0, v9}, Lo/act;->e(Lo/act;Lcom/huawei/hihealth/HiUserPreference;)I

    move-result v11

    .line 288
    const/4 v0, 0x5

    if-ge v11, v0, :cond_2

    .line 289
    const/4 v10, 0x0

    goto :goto_0

    .line 291
    :cond_2
    const/4 v10, 0x1

    .line 293
    :goto_0
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v0}, Lo/act;->e(Lo/act;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/act$4;->a:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/act$4;->a:Lo/acu;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v2, v10}, Lo/act;->a(Lo/act;Z)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/act$4;->a:Lo/acu;

    iget-object v4, p0, Lo/act$4;->a:Lo/acu;

    invoke-virtual {v4}, Lo/acu;->k()Z

    move-result v5

    move v6, v10

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lo/act;->a(Lo/act;Landroid/content/Context;Ljava/lang/String;Lo/acu;ZZZ)V

    .line 295
    goto :goto_2

    .line 296
    :cond_3
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    iget-object v1, p0, Lo/act$4;->a:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v9, v1}, Lo/act;->b(Lo/act;Lcom/huawei/hihealth/HiUserPreference;Ljava/lang/String;)Z

    move-result v11

    .line 297
    if-eqz v11, :cond_4

    .line 298
    const/4 v10, 0x0

    goto :goto_1

    .line 300
    :cond_4
    const/4 v10, 0x1

    .line 302
    :goto_1
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    iget-object v1, p0, Lo/act$4;->a:Lo/acu;

    invoke-static {v0, v8, v1}, Lo/act;->e(Lo/act;Lo/acu;Lo/acu;)V

    .line 303
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/act$4;->b:Lo/act;

    invoke-static {v2, v10}, Lo/act;->a(Lo/act;Z)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/act$4;->a:Lo/acu;

    iget-object v4, p0, Lo/act$4;->a:Lo/acu;

    invoke-virtual {v4}, Lo/acu;->k()Z

    move-result v5

    move v6, v10

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lo/act;->a(Lo/act;Landroid/content/Context;Ljava/lang/String;Lo/acu;ZZZ)V

    .line 306
    :goto_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v11

    .line 307
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    const/4 v1, 0x0

    invoke-static {v0, v11, v1}, Lo/act;->d(Lo/act;Lcom/huawei/hihealth/HiUserPreference;Z)V

    .line 308
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo_expand"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v12

    .line 309
    iget-object v0, p0, Lo/act$4;->b:Lo/act;

    const/4 v1, 0x1

    invoke-static {v0, v12, v1}, Lo/act;->d(Lo/act;Lcom/huawei/hihealth/HiUserPreference;Z)V

    .line 312
    :cond_5
    iget-object v0, p0, Lo/act$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 313
    return-void
.end method

.class Lo/eud$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lo/eud;


# direct methods
.method private constructor <init>(Lo/eud;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/eud$a;->a:Lo/eud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/eud;Lo/eud$4;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lo/eud$a;-><init>(Lo/eud;)V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 6

    .line 171
    iget-object v0, p0, Lo/eud$a;->a:Lo/eud;

    invoke-static {v0}, Lo/eud;->b(Lo/eud;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/eud$a;->a:Lo/eud;

    invoke-static {v0}, Lo/eud;->b(Lo/eud;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-interface/range {v0 .. v5}, Lo/euh;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 175
    :cond_0
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 7

    .line 112
    move-object v4, p1

    :try_start_0
    check-cast v4, Lorg/json/JSONObject;

    .line 116
    const-string v0, "openid"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "access_token"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 119
    const-string v0, "openid"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 120
    const-string v0, "access_token"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 121
    new-instance v0, Lo/eud$a$3;

    invoke-direct {v0, p0, v6, v5}, Lo/eud$a$3;-><init>(Lo/eud$a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 136
    invoke-virtual {v0, v1}, Lo/eud$a$3;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 145
    :cond_0
    goto :goto_0

    .line 138
    :catch_0
    move-exception v4

    .line 140
    invoke-static {}, Lo/eud;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onComplete() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    goto :goto_0

    .line 142
    :catch_1
    move-exception v4

    .line 144
    invoke-static {}, Lo/eud;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onComplete() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    :goto_0
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 6

    .line 160
    iget-object v0, p0, Lo/eud$a;->a:Lo/eud;

    invoke-static {v0}, Lo/eud;->b(Lo/eud;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 162
    iget-object v0, p0, Lo/eud$a;->a:Lo/eud;

    invoke-static {v0}, Lo/eud;->b(Lo/eud;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-interface/range {v0 .. v5}, Lo/euh;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 164
    :cond_0
    return-void
.end method

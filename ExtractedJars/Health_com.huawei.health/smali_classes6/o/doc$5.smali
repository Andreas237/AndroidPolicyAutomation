.class Lo/doc$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/doc;->c(Lo/doi;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/up/model/UserInfomation;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/doc;

.field final synthetic e:Lo/doi;


# direct methods
.method constructor <init>(Lo/doc;Lo/doi;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lo/doc$5;->a:Lo/doc;

    iput-object p2, p0, Lo/doc$5;->e:Lo/doi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/up/model/UserInfomation;Ljava/lang/String;Z)V
    .locals 5

    .line 129
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfoFromUp operationResult is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    if-nez p3, :cond_0

    .line 133
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoFromUp Fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lo/doc$5;->e:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 135
    return-void

    .line 138
    :cond_0
    if-eqz p3, :cond_1

    if-nez p1, :cond_1

    .line 139
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFromUp success,the data fackback is null,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lo/doc$5;->e:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 141
    return-void

    .line 147
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 148
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfomation birthday empty,force default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const-string v0, "19900801"

    invoke-virtual {p1, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 150
    const-string v0, "UNSETED"

    invoke-virtual {p1, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    goto :goto_0

    .line 152
    :cond_2
    const-string v0, "SETED"

    invoke-virtual {p1, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 156
    :goto_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 157
    const-string v0, "userInfomation"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    iget-object v0, p0, Lo/doc$5;->e:Lo/doi;

    invoke-virtual {v0, v4}, Lo/doi;->e(Ljava/util/Map;)V

    .line 159
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 126
    move-object v0, p1

    check-cast v0, Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {p0, v0, p2, p3}, Lo/doc$5;->b(Lcom/huawei/up/model/UserInfomation;Ljava/lang/String;Z)V

    return-void
.end method

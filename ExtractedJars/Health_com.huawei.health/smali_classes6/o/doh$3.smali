.class Lo/doh$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/doh;->b(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/up/model/UserInfomation;

.field final synthetic d:Lo/dod$b$d;

.field final synthetic e:Lo/doh;


# direct methods
.method constructor <init>(Lo/doh;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/doh$3;->e:Lo/doh;

    iput-object p2, p0, Lo/doh$3;->a:Lcom/huawei/up/model/UserInfomation;

    iput-object p3, p0, Lo/doh$3;->d:Lo/dod$b$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 162
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData onFailure:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lo/doh$3;->d:Lo/dod$b$d;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/doe;->a(Lo/dod$b$d;I)V

    .line 164
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 146
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    iget-object v0, p0, Lo/doh$3;->a:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v4

    .line 148
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "default"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    const-string v4, ""

    .line 151
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    iget-object v0, p0, Lo/doh$3;->e:Lo/doh;

    invoke-static {v0}, Lo/doh;->b(Lo/doh;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/dou;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 154
    :cond_1
    iget-object v0, p0, Lo/doh$3;->e:Lo/doh;

    invoke-static {v0}, Lo/doh;->b(Lo/doh;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/dou;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 157
    :goto_0
    iget-object v0, p0, Lo/doh$3;->d:Lo/dod$b$d;

    invoke-static {v0}, Lo/doe;->e(Lo/dod$b$d;)V

    .line 158
    return-void
.end method

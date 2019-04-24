.class Lo/cwi$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwi;


# direct methods
.method constructor <init>(Lo/cwi;)V
    .locals 0

    .line 788
    iput-object p1, p0, Lo/cwi$15;->a:Lo/cwi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 807
    iget-object v0, p0, Lo/cwi$15;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->l(Lo/cwi;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 797
    iget-object v0, p0, Lo/cwi$15;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->l(Lo/cwi;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 802
    iget-object v0, p0, Lo/cwi$15;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->l(Lo/cwi;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 792
    iget-object v0, p0, Lo/cwi$15;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->l(Lo/cwi;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

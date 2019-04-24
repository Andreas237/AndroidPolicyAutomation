.class Lo/dnw$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw$4;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dnw$4;


# direct methods
.method constructor <init>(Lo/dnw$4;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lo/dnw$4$5;->c:Lo/dnw$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 95
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 96
    if-nez p1, :cond_0

    .line 97
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UserInfoReader read in init success (AccountDataExtMgr) ,obj null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lo/dnw$4$5;->c:Lo/dnw$4;

    iget-object v0, v0, Lo/dnw$4;->b:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 99
    return-void

    .line 101
    :cond_0
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit HiHealthReader read:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const-string v0, "userInfo"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    iget-object v0, p0, Lo/dnw$4$5;->c:Lo/dnw$4;

    iget-object v0, v0, Lo/dnw$4;->b:Lo/doi;

    invoke-virtual {v0, v4}, Lo/doi;->e(Ljava/util/Map;)V

    .line 105
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 109
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_INIT_DATA_FROM_HIHEALTH Fail:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lo/dnw$4$5;->c:Lo/dnw$4;

    iget-object v0, v0, Lo/dnw$4;->b:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 111
    return-void
.end method

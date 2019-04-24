.class Lo/dnu$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnu$1;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dnu$1;


# direct methods
.method constructor <init>(Lo/dnu$1;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/dnu$1$3;->d:Lo/dnu$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 84
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 85
    if-nez p1, :cond_0

    .line 86
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UserInfoReader read in init success (AccountDataMgrByNAllowLoginArea) ,obj null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lo/dnu$1$3;->d:Lo/dnu$1;

    iget-object v0, v0, Lo/dnu$1;->d:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 88
    return-void

    .line 92
    :cond_0
    const-string v0, "userInfo"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    iget-object v0, p0, Lo/dnu$1$3;->d:Lo/dnu$1;

    iget-object v0, v0, Lo/dnu$1;->d:Lo/doi;

    invoke-virtual {v0, v4}, Lo/doi;->e(Ljava/util/Map;)V

    .line 94
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 98
    const-string v0, "AccountDataMgrByNAllowLoginArea"

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

    .line 99
    iget-object v0, p0, Lo/dnu$1$3;->d:Lo/dnu$1;

    iget-object v0, v0, Lo/dnu$1;->d:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 100
    return-void
.end method

.class final Lo/asu$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asu;->b(Lo/asu;Ljava/util/ArrayList;)Lo/awj$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/asu;

.field final synthetic c:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lo/asu;Ljava/util/ArrayList;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lo/asu$3;->a:Lo/asu;

    iput-object p2, p0, Lo/asu$3;->c:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 3

    .line 145
    const-string v0, "CreateGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createNormalGroup requestUserSNSInfo errorCallback errno:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lo/asu$3;->a:Lo/asu;

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1}, Lo/asu;->c(Lo/asu;III)V

    .line 147
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 4

    .line 131
    if-eqz p1, :cond_0

    .line 133
    iget-object v0, p0, Lo/asu$3;->a:Lo/asu;

    iget-object v1, p0, Lo/asu$3;->c:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lo/asu;->e(Lo/asu;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 137
    :cond_0
    const-string v0, "CreateGroupTask"

    const-string v1, "createNormalGroup requestUserSNSInfo info is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lo/asu$3;->a:Lo/asu;

    const/16 v1, 0xa2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/asu;->c(Lo/asu;III)V

    .line 140
    :goto_0
    return-void
.end method

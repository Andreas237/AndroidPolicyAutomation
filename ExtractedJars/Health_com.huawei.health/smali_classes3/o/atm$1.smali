.class final Lo/atm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atm;->b(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/awj$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/atm;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/atm$1;->b:Lo/atm;

    iput-object p2, p0, Lo/atm$1;->d:Ljava/util/ArrayList;

    iput-object p3, p0, Lo/atm$1;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 3

    .line 156
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

    .line 157
    iget-object v0, p0, Lo/atm$1;->b:Lo/atm;

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1}, Lo/atm;->d(Lo/atm;III)V

    .line 158
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 4

    .line 142
    if-eqz p1, :cond_0

    .line 144
    iget-object v0, p0, Lo/atm$1;->b:Lo/atm;

    iget-object v1, p0, Lo/atm$1;->d:Ljava/util/ArrayList;

    iget-object v2, p0, Lo/atm$1;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/atm;->a(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)V

    goto :goto_0

    .line 148
    :cond_0
    const-string v0, "CreateGroupTask"

    const-string v1, "createNormalGroup requestUserSNSInfo info is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lo/atm$1;->b:Lo/atm;

    const/16 v1, 0xa2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/atm;->d(Lo/atm;III)V

    .line 151
    :goto_0
    return-void
.end method

.class final Lo/aoc$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aoc;->d(Lo/aoj;Lo/aol;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aol;

.field final synthetic b:Ljava/util/HashMap;

.field final synthetic e:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Ljava/util/HashMap;Ljava/util/HashMap;Lo/aol;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lo/aoc$3;->b:Ljava/util/HashMap;

    iput-object p2, p0, Lo/aoc$3;->e:Ljava/util/HashMap;

    iput-object p3, p0, Lo/aoc$3;->a:Lo/aol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 174
    const-string v0, "Group_HWHealthCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail SOCIAL_MAIN_SPORT_RANK i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 5

    .line 163
    const-string v0, "Group_HWHealthCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess addGroupInfo url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const-string v0, "Group_HWHealthCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpPost request url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/addGroupInfo\n params:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aoc$3;->b:Ljava/util/HashMap;

    .line 166
    invoke-virtual {v3}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",headers:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aoc$3;->e:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 165
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/addGroupInfo"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/aoc$3;->b:Ljava/util/HashMap;

    iget-object v3, p0, Lo/aoc$3;->e:Ljava/util/HashMap;

    iget-object v4, p0, Lo/aoc$3;->a:Lo/aol;

    invoke-static {v0, v1, v2, v3, v4}, Lo/aon;->e(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lo/aol;)I

    .line 170
    return-void
.end method
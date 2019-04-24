.class Lo/awj$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awj;->l()Lo/awj$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/awj;


# direct methods
.method constructor <init>(Lo/awj;)V
    .locals 0

    .line 485
    iput-object p1, p0, Lo/awj$3;->d:Lo/awj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 3

    .line 495
    iget-object v0, p0, Lo/awj$3;->d:Lo/awj;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Lo/awj;->d(Lo/awj;ZILcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    .line 496
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 3

    .line 489
    iget-object v0, p0, Lo/awj$3;->d:Lo/awj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1}, Lo/awj;->d(Lo/awj;ZILcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    .line 490
    return-void
.end method

.class public Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/circle/GetCircleResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Circle"
.end annotation


# instance fields
.field private action_param_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;>;"
        }
    .end annotation
.end field

.field private app_id_:Ljava/lang/String;

.field private app_name_:Ljava/lang/String;

.field private app_package_:Ljava/lang/String;

.field private app_redirect_:Z

.field private app_version_:J

.field private circle_content_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;>;"
        }
    .end annotation
.end field

.field private circle_name_:Ljava/lang/String;

.field private redirect_action_:Ljava/lang/String;

.field private redirect_url_:Ljava/lang/String;

.field private show_download_:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getAction_param_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;>;"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->action_param_:Ljava/util/List;

    return-object v0
.end method

.method public getApp_id_()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->app_id_:Ljava/lang/String;

    .line 122
    return-object v0
.end method

.method public getApp_name_()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->app_name_:Ljava/lang/String;

    .line 110
    return-object v0
.end method

.method public getApp_package_()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->app_package_:Ljava/lang/String;

    .line 104
    return-object v0
.end method

.method public getApp_version_()J
    .locals 2

    .line 115
    iget-wide v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->app_version_:J

    .line 116
    return-wide v0
.end method

.method public getCircle_content_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;>;"
        }
    .end annotation

    .line 150
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->circle_content_:Ljava/util/List;

    return-object v0
.end method

.method public getCircle_name_()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->circle_name_:Ljava/lang/String;

    .line 92
    return-object v0
.end method

.method public getRedirect_action_()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->redirect_action_:Ljava/lang/String;

    .line 140
    return-object v0
.end method

.method public getRedirect_url_()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->redirect_url_:Ljava/lang/String;

    .line 134
    return-object v0
.end method

.method public isApp_redirect_()Z
    .locals 1

    .line 127
    iget-boolean v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->app_redirect_:Z

    .line 128
    return v0
.end method

.method public isShow_download_()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->show_download_:Z

    .line 98
    return v0
.end method

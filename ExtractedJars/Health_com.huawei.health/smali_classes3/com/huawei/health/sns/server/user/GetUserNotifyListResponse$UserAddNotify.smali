.class public Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UserAddNotify"
.end annotation


# instance fields
.field private frdAddNotes_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;>;"
        }
    .end annotation
.end field

.field private frdImageURLDownload_:Ljava/lang/String;

.field private frdImageURL_:Ljava/lang/String;

.field private frdNickName_:Ljava/lang/String;

.field private frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

.field private frdPhoneDigest_:Ljava/lang/String;

.field private frdUID_:J

.field private myOrigin_:Lcom/huawei/health/sns/server/user/Origin;

.field private notifiedSide_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdAddNotes_:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getFrdAddNotes_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;>;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdAddNotes_:Ljava/util/List;

    return-object v0
.end method

.method public getFrdImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdImageURLDownload_:Ljava/lang/String;

    .line 127
    return-object v0
.end method

.method public getFrdImageURL_()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdImageURL_:Ljava/lang/String;

    .line 121
    return-object v0
.end method

.method public getFrdNickName_()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdNickName_:Ljava/lang/String;

    .line 133
    return-object v0
.end method

.method public getFrdOrigin_()Lcom/huawei/health/sns/server/user/Origin;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    return-object v0
.end method

.method public getFrdPhoneDigest_()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdPhoneDigest_:Ljava/lang/String;

    .line 139
    return-object v0
.end method

.method public getFrdUID_()J
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdUID_:J

    .line 115
    return-wide v0
.end method

.method public getMyOrigin_()Lcom/huawei/health/sns/server/user/Origin;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->myOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    return-object v0
.end method

.method public getNotifiedSide_()I
    .locals 1

    .line 149
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->notifiedSide_:I

    .line 150
    return v0
.end method

.method public setFrdOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    .line 161
    return-void
.end method

.method public setMyOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;->myOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    .line 171
    return-void
.end method

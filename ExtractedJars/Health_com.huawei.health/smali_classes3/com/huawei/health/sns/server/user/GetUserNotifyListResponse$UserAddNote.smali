.class public Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UserAddNote"
.end annotation


# instance fields
.field private note_:Ljava/lang/String;

.field private pkg_:Ljava/lang/String;

.field private sendTime_:Ljava/lang/String;

.field private type_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 174
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 179
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->type_:I

    .line 184
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->sendTime_:Ljava/lang/String;

    .line 189
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->note_:Ljava/lang/String;

    .line 194
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->pkg_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getNote_()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->note_:Ljava/lang/String;

    .line 217
    return-object v0
.end method

.method public getPkg()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->pkg_:Ljava/lang/String;

    .line 199
    return-object v0
.end method

.method public getSendTime_()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->sendTime_:Ljava/lang/String;

    .line 211
    return-object v0
.end method

.method public getType_()I
    .locals 1

    .line 204
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;->type_:I

    .line 205
    return v0
.end method

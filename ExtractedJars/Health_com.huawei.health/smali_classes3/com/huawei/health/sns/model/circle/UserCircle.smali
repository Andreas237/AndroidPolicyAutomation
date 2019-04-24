.class public Lcom/huawei/health/sns/model/circle/UserCircle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/circle/UserCircle;>;"
        }
    .end annotation
.end field


# instance fields
.field private actionParam:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/circle/CircleActionParam;>;"
        }
    .end annotation
.end field

.field private appId:Ljava/lang/String;

.field private appName:Ljava/lang/String;

.field private appPackage:Ljava/lang/String;

.field private appRedirect:Z

.field private appVersion:J

.field private circleContent:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircleContent;>;"
        }
    .end annotation
.end field

.field private circleName:Ljava/lang/String;

.field private id:I

.field private redirectAction:Ljava/lang/String;

.field private redirectUrl:Ljava/lang/String;

.field private showDownload:Z

.field private userId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 222
    new-instance v0, Lcom/huawei/health/sns/model/circle/UserCircle$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/circle/UserCircle$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/circle/UserCircle;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->id:I

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 240
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->id:I

    .line 241
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->userId:J

    .line 242
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleName:Ljava/lang/String;

    .line 243
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->showDownload:Z

    .line 244
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appPackage:Ljava/lang/String;

    .line 245
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appName:Ljava/lang/String;

    .line 246
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appVersion:J

    .line 247
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appId:Ljava/lang/String;

    .line 248
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appRedirect:Z

    .line 249
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->redirectUrl:Ljava/lang/String;

    .line 250
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->redirectAction:Ljava/lang/String;

    .line 251
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->actionParam:Ljava/util/List;

    .line 252
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->actionParam:Ljava/util/List;

    const-class v1, Lcom/huawei/health/sns/model/circle/CircleActionParam;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 253
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleContent:Ljava/util/List;

    .line 254
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleContent:Ljava/util/List;

    const-class v1, Lcom/huawei/health/sns/model/circle/UserCircleContent;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 255
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 201
    const/4 v0, 0x0

    return v0
.end method

.method public getActionParam()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/circle/CircleActionParam;>;"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->actionParam:Ljava/util/List;

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appId:Ljava/lang/String;

    .line 92
    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appName:Ljava/lang/String;

    .line 80
    return-object v0
.end method

.method public getAppPackage()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appPackage:Ljava/lang/String;

    .line 74
    return-object v0
.end method

.method public getAppVersion()J
    .locals 2

    .line 85
    iget-wide v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appVersion:J

    .line 86
    return-wide v0
.end method

.method public getCircleContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircleContent;>;"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleContent:Ljava/util/List;

    return-object v0
.end method

.method public getCircleName()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleName:Ljava/lang/String;

    .line 62
    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->id:I

    .line 32
    return v0
.end method

.method public getRedirectAction()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->redirectAction:Ljava/lang/String;

    .line 110
    return-object v0
.end method

.method public getRedirectUrl()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->redirectUrl:Ljava/lang/String;

    .line 104
    return-object v0
.end method

.method public getUserId()J
    .locals 2

    .line 55
    iget-wide v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->userId:J

    .line 56
    return-wide v0
.end method

.method public isAppRedirect()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appRedirect:Z

    .line 98
    return v0
.end method

.method public isShowDownload()Z
    .locals 1

    .line 67
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->showDownload:Z

    .line 68
    return v0
.end method

.method public setActionParam(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/CircleActionParam;>;)V"
        }
    .end annotation

    .line 120
    iput-object p1, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->actionParam:Ljava/util/List;

    .line 121
    return-void
.end method

.method public setAppData(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appPackage:Ljava/lang/String;

    .line 45
    iput-object p2, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appName:Ljava/lang/String;

    .line 46
    iput-wide p3, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appVersion:J

    .line 47
    iput-object p5, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appId:Ljava/lang/String;

    .line 48
    iput-boolean p6, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appRedirect:Z

    .line 49
    iput-object p7, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->redirectUrl:Ljava/lang/String;

    .line 50
    iput-object p8, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->redirectAction:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setCircleContent(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircleContent;>;)V"
        }
    .end annotation

    .line 130
    iput-object p1, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleContent:Ljava/util/List;

    .line 131
    return-void
.end method

.method public setUserData(JLjava/lang/String;Z)V
    .locals 0

    .line 37
    iput-wide p1, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->userId:J

    .line 38
    iput-object p3, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleName:Ljava/lang/String;

    .line 39
    iput-boolean p4, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->showDownload:Z

    .line 40
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 207
    iget v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 208
    iget-wide v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 209
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 210
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->showDownload:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appPackage:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 213
    iget-wide v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appVersion:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 214
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 215
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->appRedirect:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 216
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->redirectUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->redirectAction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->actionParam:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircle;->circleContent:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 220
    return-void
.end method

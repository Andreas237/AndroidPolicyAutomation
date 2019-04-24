.class public Lcom/huawei/bone/social/manager/db/AssistentTable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/bone/social/manager/db/AssistentTable;>;"
        }
    .end annotation
.end field


# instance fields
.field private bgImgUrl:Ljava/lang/String;

.field private huId:J

.field private id:I

.field private imgUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Lcom/huawei/bone/social/manager/db/AssistentTable$5;

    invoke-direct {v0}, Lcom/huawei/bone/social/manager/db/AssistentTable$5;-><init>()V

    sput-object v0, Lcom/huawei/bone/social/manager/db/AssistentTable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->id:I

    .line 12
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->huId:J

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->bgImgUrl:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->imgUrl:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$002(Lcom/huawei/bone/social/manager/db/AssistentTable;J)J
    .locals 0

    .line 9
    iput-wide p1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->huId:J

    return-wide p1
.end method

.method static synthetic access$102(Lcom/huawei/bone/social/manager/db/AssistentTable;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->name:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$202(Lcom/huawei/bone/social/manager/db/AssistentTable;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->bgImgUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$302(Lcom/huawei/bone/social/manager/db/AssistentTable;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->imgUrl:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 53
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 96
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getBgImgUrl()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->bgImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getHuId()J
    .locals 2

    .line 23
    iget-wide v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->huId:J

    return-wide v0
.end method

.method public getImgUrl()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->imgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 101
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public initeight()V
    .locals 0

    .line 112
    return-void
.end method

.method public initfive()V
    .locals 0

    .line 109
    return-void
.end method

.method public initfour()V
    .locals 0

    .line 108
    return-void
.end method

.method public initone()V
    .locals 0

    .line 105
    return-void
.end method

.method public initseven()V
    .locals 0

    .line 111
    return-void
.end method

.method public initsix()V
    .locals 0

    .line 110
    return-void
.end method

.method public initthree()V
    .locals 0

    .line 107
    return-void
.end method

.method public inittwo()V
    .locals 0

    .line 106
    return-void
.end method

.method public saveBgImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->bgImgUrl:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public saveHuId(J)V
    .locals 0

    .line 27
    iput-wide p1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->huId:J

    .line 28
    return-void
.end method

.method public saveImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->imgUrl:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->name:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AssistentTable{bgImgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->bgImgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", huId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->huId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->imgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->huId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 59
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->bgImgUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/AssistentTable;->imgUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    return-void
.end method

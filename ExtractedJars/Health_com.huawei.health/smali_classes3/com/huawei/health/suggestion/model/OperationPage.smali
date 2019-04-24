.class public Lcom/huawei/health/suggestion/model/OperationPage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/OperationPage;>;"
        }
    .end annotation
.end field

.field public static final TYPE_END_SOLUTION_NO_SHOW:I = 0x0

.field public static final TYPE_END_SOLUTION_SHOW:I = 0x1


# instance fields
.field private beginDate:J

.field private createTime:J

.field private defSelection:Ljava/lang/String;

.field private emui90ImageUrl:Ljava/lang/String;

.field private endDate:J

.field private endSolution:I

.field private id:I

.field private modifyTime:J

.field private pageType:I

.field private pictureUrl:Ljava/lang/String;

.field private position:I

.field private status:I

.field private type:I

.field private url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 186
    new-instance v0, Lcom/huawei/health/suggestion/model/OperationPage$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/OperationPage$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/OperationPage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->id:I

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pageType:I

    .line 149
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->position:I

    .line 150
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->type:I

    .line 151
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pictureUrl:Ljava/lang/String;

    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->url:Ljava/lang/String;

    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->defSelection:Ljava/lang/String;

    .line 154
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->beginDate:J

    .line 155
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endDate:J

    .line 156
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endSolution:I

    .line 157
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->createTime:J

    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->modifyTime:J

    .line 159
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->status:I

    .line 160
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->emui90ImageUrl:Ljava/lang/String;

    .line 161
    return-void
.end method


# virtual methods
.method public acquireBeginDate()J
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->beginDate:J

    return-wide v0
.end method

.method public acquireCreateTime()J
    .locals 2

    .line 120
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->createTime:J

    return-wide v0
.end method

.method public acquireDefSelection()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->defSelection:Ljava/lang/String;

    return-object v0
.end method

.method public acquireEmui90ImageUrl()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->emui90ImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public acquireEndDate()J
    .locals 2

    .line 104
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endDate:J

    return-wide v0
.end method

.method public acquireEndSolution()I
    .locals 1

    .line 112
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endSolution:I

    return v0
.end method

.method public acquireId()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->id:I

    return v0
.end method

.method public acquireModifyTime()J
    .locals 2

    .line 128
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->modifyTime:J

    return-wide v0
.end method

.method public acquirePageType()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pageType:I

    return v0
.end method

.method public acquirePictureUrl()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pictureUrl:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePosition()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->position:I

    return v0
.end method

.method public acquireStatus()I
    .locals 1

    .line 136
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->status:I

    return v0
.end method

.method public acquireType()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->type:I

    return v0
.end method

.method public acquireUrl()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->url:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 183
    const/4 v0, 0x0

    return v0
.end method

.method public saveBeginDate(J)V
    .locals 0

    .line 100
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->beginDate:J

    .line 101
    return-void
.end method

.method public saveCreateTime(J)V
    .locals 0

    .line 124
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->createTime:J

    .line 125
    return-void
.end method

.method public saveDefSelection(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->defSelection:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public saveEmui90ImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->emui90ImageUrl:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public saveEndDate(J)V
    .locals 0

    .line 108
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endDate:J

    .line 109
    return-void
.end method

.method public saveEndSolution(I)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endSolution:I

    .line 117
    return-void
.end method

.method public saveId(I)V
    .locals 0

    .line 34
    iput p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->id:I

    .line 35
    return-void
.end method

.method public saveModifyTime(J)V
    .locals 0

    .line 132
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->modifyTime:J

    .line 133
    return-void
.end method

.method public savePageType(I)V
    .locals 0

    .line 42
    iput p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pageType:I

    .line 43
    return-void
.end method

.method public savePictureUrl(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pictureUrl:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public savePosition(I)V
    .locals 0

    .line 50
    iput p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->position:I

    .line 51
    return-void
.end method

.method public saveStatus(I)V
    .locals 0

    .line 140
    iput p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->status:I

    .line 141
    return-void
.end method

.method public saveType(I)V
    .locals 0

    .line 58
    iput p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->type:I

    .line 59
    return-void
.end method

.method public saveUrl(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->url:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 200
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "OperationPage{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 201
    const-string v0, "id="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 202
    const-string v0, ", pageType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pageType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 203
    const-string v0, ", position="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->position:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 204
    const-string v0, ", type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 205
    const-string v0, ", pictureUrl=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pictureUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 206
    const-string v0, ", url=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 207
    const-string v0, ", defSelection=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->defSelection:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 208
    const-string v0, ", beginDate="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->beginDate:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 209
    const-string v0, ", endDate="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endDate:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 210
    const-string v0, ", endSolution="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endSolution:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 211
    const-string v0, ", createTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->createTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 212
    const-string v0, ", modifyTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->modifyTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 213
    const-string v0, ", status="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 214
    const-string v0, ", emui90ImageUrl="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/OperationPage;->emui90ImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 215
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 216
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 165
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pageType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 167
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->position:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->pictureUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->defSelection:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 172
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->beginDate:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 173
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endDate:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 174
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->endSolution:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 175
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->createTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 176
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->modifyTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 177
    iget v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->status:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/OperationPage;->emui90ImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 179
    return-void
.end method

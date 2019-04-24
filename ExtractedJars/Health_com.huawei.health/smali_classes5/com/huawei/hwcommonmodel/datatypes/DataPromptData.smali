.class public Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;>;"
        }
    .end annotation
.end field


# instance fields
.field private dot_metrix_color:I

.field private dot_metrix_data:[B

.field private dot_metrix_height:I

.field private dot_metrix_width:I

.field private motor_enable:I

.field private prompt_type:I

.field private text_content:Ljava/lang/String;

.field private text_format:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 203
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData$1;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData$1;-><init>()V

    sput-object v0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 190
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->prompt_type:I

    .line 194
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->motor_enable:I

    .line 195
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_height:I

    .line 196
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_width:I

    .line 197
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_color:I

    .line 198
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_data:[B

    .line 199
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->text_format:I

    .line 200
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->text_content:Ljava/lang/String;

    .line 201
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 174
    const/4 v0, 0x0

    return v0
.end method

.method public getDot_metrix_color()I
    .locals 1

    .line 162
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_color:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDot_metrix_data()[B
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_data:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_data:[B

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_data:[B

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0

    .line 119
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDot_metrix_height()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_height:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDot_metrix_width()I
    .locals 1

    .line 102
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_width:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMotor_enable()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->motor_enable:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPrompt_type()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->prompt_type:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getText_content()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->text_content:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getText_format()I
    .locals 1

    .line 134
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->text_format:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setDot_metrix_color(I)V
    .locals 1

    .line 169
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_color:I

    .line 170
    return-void
.end method

.method public setDot_metrix_data([B)V
    .locals 1

    .line 127
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_data:[B

    .line 128
    return-void
.end method

.method public setDot_metrix_height(I)V
    .locals 1

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_height:I

    .line 96
    return-void
.end method

.method public setDot_metrix_width(I)V
    .locals 1

    .line 109
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_width:I

    .line 110
    return-void
.end method

.method public setMotor_enable(I)V
    .locals 1

    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->motor_enable:I

    .line 82
    return-void
.end method

.method public setPrompt_type(I)V
    .locals 1

    .line 67
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->prompt_type:I

    .line 68
    return-void
.end method

.method public setText_content(Ljava/lang/String;)V
    .locals 1

    .line 155
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->text_content:Ljava/lang/String;

    .line 156
    return-void
.end method

.method public setText_format(I)V
    .locals 1

    .line 141
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->text_format:I

    .line 142
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 179
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->prompt_type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 180
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->motor_enable:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 181
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_height:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 182
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_width:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 183
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_color:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 184
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->dot_metrix_data:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 185
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->text_format:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 186
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->text_content:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 187
    return-void
.end method

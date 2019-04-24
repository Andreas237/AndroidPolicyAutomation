.class public Lcom/huawei/hwcommonmodel/datatypes/MsgText;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/MsgText;>;"
        }
    .end annotation
.end field


# instance fields
.field private TextContent:Ljava/lang/String;

.field private TextType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/MsgText$4;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/MsgText$4;-><init>()V

    sput-object v0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextType:I

    .line 39
    iput-object p2, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextContent:Ljava/lang/String;

    .line 40
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextType:I

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextContent:Ljava/lang/String;

    .line 56
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 44
    const/4 v0, 0x0

    return v0
.end method

.method public getTextContent()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextContent:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTextType()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setTextContent(Ljava/lang/String;)V
    .locals 1

    .line 31
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextContent:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setTextType(I)V
    .locals 1

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextType:I

    .line 24
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->TextContent:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 51
    return-void
.end method

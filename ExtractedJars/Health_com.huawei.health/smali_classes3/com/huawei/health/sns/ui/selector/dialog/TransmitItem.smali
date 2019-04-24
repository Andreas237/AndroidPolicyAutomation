.class public Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;"
        }
    .end annotation
.end field


# instance fields
.field private msgContent:Ljava/lang/String;

.field private msgId:Ljava/lang/String;

.field private msgType:I

.field private uri:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 131
    new-instance v0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem$3;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/net/Uri;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput p1, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgType:I

    .line 54
    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->uri:Landroid/net/Uri;

    .line 55
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p1, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgType:I

    .line 42
    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgContent:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput p1, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgType:I

    .line 68
    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgId:Ljava/lang/String;

    .line 69
    iput-object p3, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgContent:Ljava/lang/String;

    .line 70
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgType:I

    .line 119
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgId:Ljava/lang/String;

    .line 120
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgContent:Ljava/lang/String;

    .line 121
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->uri:Landroid/net/Uri;

    .line 122
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem$3;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 127
    const/4 v0, 0x0

    return v0
.end method

.method public getMsgContent()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgContent:Ljava/lang/String;

    .line 113
    return-object v0
.end method

.method public getMsgId()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgId:Ljava/lang/String;

    .line 102
    return-object v0
.end method

.method public getMsgType()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgType:I

    .line 91
    return v0
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->uri:Landroid/net/Uri;

    .line 80
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 150
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->msgContent:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->uri:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 154
    return-void
.end method

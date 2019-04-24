.class final Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 181
    invoke-virtual {p0, p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean$5;->d(Landroid/os/Parcel;)Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;
    .locals 1

    .line 184
    new-instance v0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    invoke-direct {v0, p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public e(I)[Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;
    .locals 1

    .line 189
    new-array v0, p1, [Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 181
    invoke-virtual {p0, p1}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean$5;->e(I)[Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    move-result-object v0

    return-object v0
.end method

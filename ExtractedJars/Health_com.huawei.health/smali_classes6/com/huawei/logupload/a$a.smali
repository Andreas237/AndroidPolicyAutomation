.class public abstract Lcom/huawei/logupload/a$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/logupload/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/logupload/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/logupload/a$a$a;
    }
.end annotation


# static fields
.field static final a:I = 0x1

.field static final b:I = 0x2

.field static final c:I = 0x3

.field static final d:I = 0x4

.field static final e:I = 0x5

.field private static final f:Ljava/lang/String; = "com.huawei.logupload.ExternalConnectionDatabase"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    invoke-virtual {p0, p0, v0}, Lcom/huawei/logupload/a$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lcom/huawei/logupload/a;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lcom/huawei/logupload/a;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lcom/huawei/logupload/a;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lcom/huawei/logupload/a$a$a;

    invoke-direct {v0, p0}, Lcom/huawei/logupload/a$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_8

    .line 42
    :sswitch_0
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    sget-object v0, Lcom/huawei/logupload/LogUpload;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/logupload/LogUpload;

    .line 51
    goto :goto_0

    .line 53
    :cond_0
    const/4 v1, 0x0

    .line 55
    :goto_0
    invoke-virtual {p0, v1}, Lcom/huawei/logupload/a$a;->a(Lcom/huawei/logupload/LogUpload;)Z

    move-result v2

    .line 56
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 57
    if-eqz v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    if-eqz v1, :cond_2

    .line 59
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    const/4 v0, 0x1

    invoke-virtual {v1, p3, v0}, Lcom/huawei/logupload/LogUpload;->writeToParcel(Landroid/os/Parcel;I)V

    .line 61
    goto :goto_2

    .line 63
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    :goto_2
    const/4 v0, 0x1

    return v0

    .line 69
    :sswitch_2
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0}, Lcom/huawei/logupload/a$a;->a()Ljava/util/List;

    move-result-object v1

    .line 71
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 72
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 73
    const/4 v0, 0x1

    return v0

    .line 77
    :sswitch_3
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    .line 80
    sget-object v0, Lcom/huawei/logupload/LogUpload;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/logupload/LogUpload;

    .line 81
    goto :goto_3

    .line 83
    :cond_3
    const/4 v1, 0x0

    .line 85
    :goto_3
    invoke-virtual {p0, v1}, Lcom/huawei/logupload/a$a;->b(Lcom/huawei/logupload/LogUpload;)Ljava/lang/String;

    move-result-object v2

    .line 86
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 87
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    if-eqz v1, :cond_4

    .line 89
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    const/4 v0, 0x1

    invoke-virtual {v1, p3, v0}, Lcom/huawei/logupload/LogUpload;->writeToParcel(Landroid/os/Parcel;I)V

    .line 91
    goto :goto_4

    .line 93
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    :goto_4
    const/4 v0, 0x1

    return v0

    .line 99
    :sswitch_4
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_5

    .line 102
    sget-object v0, Lcom/huawei/logupload/LogUpload;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/logupload/LogUpload;

    .line 103
    goto :goto_5

    .line 105
    :cond_5
    const/4 v1, 0x0

    .line 107
    :goto_5
    invoke-virtual {p0, v1}, Lcom/huawei/logupload/a$a;->c(Lcom/huawei/logupload/LogUpload;)V

    .line 108
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 109
    if-eqz v1, :cond_6

    .line 110
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 111
    const/4 v0, 0x1

    invoke-virtual {v1, p3, v0}, Lcom/huawei/logupload/LogUpload;->writeToParcel(Landroid/os/Parcel;I)V

    .line 112
    goto :goto_6

    .line 114
    :cond_6
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    :goto_6
    const/4 v0, 0x1

    return v0

    .line 120
    :sswitch_5
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 122
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-virtual {p0, v1}, Lcom/huawei/logupload/a$a;->a(Ljava/lang/String;)Lcom/huawei/logupload/LogUpload;

    move-result-object v2

    .line 124
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 125
    if-eqz v2, :cond_7

    .line 126
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 127
    const/4 v0, 0x1

    invoke-virtual {v2, p3, v0}, Lcom/huawei/logupload/LogUpload;->writeToParcel(Landroid/os/Parcel;I)V

    .line 128
    goto :goto_7

    .line 130
    :cond_7
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 132
    :goto_7
    const/4 v0, 0x1

    return v0

    .line 135
    :goto_8
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method

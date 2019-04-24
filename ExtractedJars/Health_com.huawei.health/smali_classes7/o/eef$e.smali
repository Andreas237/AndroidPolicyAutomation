.class public abstract Lo/eef$e;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/eef;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eef$e$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p0, p0, v0}, Lo/eef$e;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static e(Landroid/os/IBinder;)Lo/eef;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/eef;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lo/eef;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lo/eef$e$d;

    invoke-direct {v0, p0}, Lo/eef$e$d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_10

    .line 42
    :sswitch_0
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 50
    invoke-virtual {p0, v2}, Lo/eef$e;->d(Ljava/lang/String;)I

    move-result v3

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    const/4 v0, 0x1

    return v0

    .line 57
    :sswitch_2
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 60
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/UserReq;

    goto :goto_0

    .line 63
    :cond_0
    const/4 v2, 0x0

    .line 66
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eeg$a;->a(Landroid/os/IBinder;)Lo/eeg;

    move-result-object v3

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 69
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->b(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/eeg;Ljava/lang/String;)I

    move-result v5

    .line 70
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 71
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    const/4 v0, 0x1

    return v0

    .line 76
    :sswitch_3
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 78
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 79
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    goto :goto_1

    .line 82
    :cond_1
    const/4 v2, 0x0

    .line 85
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eei$c;->d(Landroid/os/IBinder;)Lo/eei;

    move-result-object v3

    .line 87
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 88
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->b(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eei;Ljava/lang/String;)I

    move-result v5

    .line 89
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 90
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    const/4 v0, 0x1

    return v0

    .line 95
    :sswitch_4
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 98
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    goto :goto_2

    .line 101
    :cond_2
    const/4 v2, 0x0

    .line 104
    :goto_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eee$c;->e(Landroid/os/IBinder;)Lo/eee;

    move-result-object v3

    .line 106
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 107
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->a(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eee;Ljava/lang/String;)I

    move-result v5

    .line 108
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 109
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    const/4 v0, 0x1

    return v0

    .line 114
    :sswitch_5
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 116
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 117
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/UserReq;

    goto :goto_3

    .line 120
    :cond_3
    const/4 v2, 0x0

    .line 123
    :goto_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/edy$a;->c(Landroid/os/IBinder;)Lo/edy;

    move-result-object v3

    .line 125
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 126
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->b(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I

    move-result v5

    .line 127
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 128
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 129
    const/4 v0, 0x1

    return v0

    .line 133
    :sswitch_6
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 136
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/UserReq;

    goto :goto_4

    .line 139
    :cond_4
    const/4 v2, 0x0

    .line 142
    :goto_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/edy$a;->c(Landroid/os/IBinder;)Lo/edy;

    move-result-object v3

    .line 144
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 145
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->a(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I

    move-result v5

    .line 146
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 147
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 148
    const/4 v0, 0x1

    return v0

    .line 152
    :sswitch_7
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 154
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 155
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/UserReq;

    goto :goto_5

    .line 158
    :cond_5
    const/4 v2, 0x0

    .line 161
    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/edy$a;->c(Landroid/os/IBinder;)Lo/edy;

    move-result-object v3

    .line 163
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 164
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->e(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I

    move-result v5

    .line 165
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 166
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 167
    const/4 v0, 0x1

    return v0

    .line 171
    :sswitch_8
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 173
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 174
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/GroupReq;

    goto :goto_6

    .line 177
    :cond_6
    const/4 v2, 0x0

    .line 180
    :goto_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eeb$e;->b(Landroid/os/IBinder;)Lo/eeb;

    move-result-object v3

    .line 182
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 183
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->d(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Lo/eeb;Ljava/lang/String;)I

    move-result v5

    .line 184
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 185
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 186
    const/4 v0, 0x1

    return v0

    .line 190
    :sswitch_9
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 192
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 193
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;

    goto :goto_7

    .line 196
    :cond_7
    const/4 v2, 0x0

    .line 199
    :goto_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eec$d;->b(Landroid/os/IBinder;)Lo/eec;

    move-result-object v3

    .line 201
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 202
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->b(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Lo/eec;Ljava/lang/String;)I

    move-result v5

    .line 203
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 204
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 205
    const/4 v0, 0x1

    return v0

    .line 209
    :sswitch_a
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 211
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 212
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;

    goto :goto_8

    .line 215
    :cond_8
    const/4 v2, 0x0

    .line 218
    :goto_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eea$a;->c(Landroid/os/IBinder;)Lo/eea;

    move-result-object v3

    .line 220
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 221
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->d(Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;Lo/eea;Ljava/lang/String;)I

    move-result v5

    .line 222
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 223
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 224
    const/4 v0, 0x1

    return v0

    .line 228
    :sswitch_b
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 230
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 231
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    goto :goto_9

    .line 234
    :cond_9
    const/4 v2, 0x0

    .line 237
    :goto_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 238
    invoke-virtual {p0, v2, v3}, Lo/eef$e;->c(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    move-result-object v4

    .line 239
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 240
    if-eqz v4, :cond_a

    .line 241
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 242
    const/4 v0, 0x1

    invoke-virtual {v4, p3, v0}, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_a

    .line 245
    :cond_a
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 247
    :goto_a
    const/4 v0, 0x1

    return v0

    .line 251
    :sswitch_c
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 253
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 254
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/GroupReq;

    goto :goto_b

    .line 257
    :cond_b
    const/4 v2, 0x0

    .line 260
    :goto_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 261
    invoke-virtual {p0, v2, v3}, Lo/eef$e;->a(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupListResp;

    move-result-object v4

    .line 262
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 263
    if-eqz v4, :cond_c

    .line 264
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 265
    const/4 v0, 0x1

    invoke-virtual {v4, p3, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_c

    .line 268
    :cond_c
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 270
    :goto_c
    const/4 v0, 0x1

    return v0

    .line 274
    :sswitch_d
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 276
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_d

    .line 277
    sget-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;

    goto :goto_d

    .line 280
    :cond_d
    const/4 v2, 0x0

    .line 283
    :goto_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 284
    invoke-virtual {p0, v2, v3}, Lo/eef$e;->e(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;

    move-result-object v4

    .line 285
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 286
    if-eqz v4, :cond_e

    .line 287
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 288
    const/4 v0, 0x1

    invoke-virtual {v4, p3, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_e

    .line 291
    :cond_e
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 293
    :goto_e
    const/4 v0, 0x1

    return v0

    .line 297
    :sswitch_e
    const-string v0, "com.huawei.sns.sdk.openapi.ISNSSDKOpenAIDL"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 299
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 300
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Bundle;

    goto :goto_f

    .line 303
    :cond_f
    const/4 v2, 0x0

    .line 306
    :goto_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eed$d;->e(Landroid/os/IBinder;)Lo/eed;

    move-result-object v3

    .line 308
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 309
    invoke-virtual {p0, v2, v3, v4}, Lo/eef$e;->a(Landroid/os/Bundle;Lo/eed;Ljava/lang/String;)I

    move-result v5

    .line 310
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 311
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 312
    const/4 v0, 0x1

    return v0

    .line 315
    :goto_10
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
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xa -> :sswitch_a
        0xb -> :sswitch_b
        0xc -> :sswitch_c
        0xd -> :sswitch_d
        0xe -> :sswitch_e
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method

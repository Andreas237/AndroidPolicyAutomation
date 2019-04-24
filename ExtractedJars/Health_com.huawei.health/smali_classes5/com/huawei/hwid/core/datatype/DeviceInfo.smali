.class public Lcom/huawei/hwid/core/datatype/DeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/DeviceInfo;>;"
        }
    .end annotation
.end field

.field public static final TAG_DEVICE_ALIASNAME:Ljava/lang/String; = "deviceAliasName"

.field public static final TAG_DEVICE_FREQUENTLYUSED:Ljava/lang/String; = "frequentlyUsed"

.field public static final TAG_DEVICE_ID:Ljava/lang/String; = "deviceID"

.field public static final TAG_DEVICE_INFO:Ljava/lang/String; = "deviceInfo"

.field public static final TAG_DEVICE_INFO_LIST:Ljava/lang/String; = "deviceIDList"

.field public static final TAG_DEVICE_LOGINTIME:Ljava/lang/String; = "loginTime"

.field public static final TAG_DEVICE_LOGOUTTIME:Ljava/lang/String; = "logoutTime"

.field public static final TAG_DEVICE_TYPE:Ljava/lang/String; = "deviceType"

.field public static final TAG_TERMINALTYPE:Ljava/lang/String; = "terminalType"

.field public static final TAG_UUID:Ljava/lang/String; = "uuid"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 238
    new-instance v0, Lcom/huawei/hwid/core/datatype/DeviceInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->g:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->g:Ljava/lang/String;

    .line 71
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a:Ljava/lang/String;

    .line 72
    iput-object p2, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b:Ljava/lang/String;

    .line 73
    iput-object p3, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c:Ljava/lang/String;

    .line 74
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic f(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->f:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic g(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->g:Ljava/lang/String;

    return-object p1
.end method

.method public static getDeviceInfoInTag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 218
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 219
    :cond_0
    return-void

    .line 221
    :cond_1
    const-string v0, "deviceID"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 222
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->setDeviceIdInDeviceInfo(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 223
    :cond_2
    const-string v0, "deviceType"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 224
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->setDeviceType(Ljava/lang/String;)V

    goto :goto_0

    .line 225
    :cond_3
    const-string v0, "terminalType"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 226
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->setTerminalType(Ljava/lang/String;)V

    goto :goto_0

    .line 227
    :cond_4
    const-string v0, "deviceAliasName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 228
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->setDeviceAliasName(Ljava/lang/String;)V

    goto :goto_0

    .line 229
    :cond_5
    const-string v0, "loginTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 230
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->setmLoginTime(Ljava/lang/String;)V

    goto :goto_0

    .line 231
    :cond_6
    const-string v0, "logoutTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 232
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->setmLogoutTime(Ljava/lang/String;)V

    goto :goto_0

    .line 233
    :cond_7
    const-string v0, "frequentlyUsed"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 234
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->setmFrequentlyUsed(Ljava/lang/String;)V

    .line 236
    :cond_8
    :goto_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 114
    const/4 v0, 0x0

    return v0
.end method

.method public getDeviceAliasName()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceID()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getTerminalType()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getmFrequentlyUsed()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getmLoginTime()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getmLogoutTime()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->f:Ljava/lang/String;

    return-object v0
.end method

.method public isLogin()Z
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    const/4 v0, 0x0

    return v0

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    const/4 v0, 0x0

    return v0

    .line 151
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public isObjectEquals(Ljava/lang/Object;)Z
    .locals 3

    .line 173
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 174
    const/4 v0, 0x0

    return v0

    .line 176
    :cond_0
    instance-of v0, p1, Lcom/huawei/hwid/core/datatype/DeviceInfo;

    if-eqz v0, :cond_4

    .line 177
    if-ne p0, p1, :cond_1

    .line 178
    const/4 v0, 0x1

    return v0

    .line 180
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/huawei/hwid/core/datatype/DeviceInfo;

    .line 181
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->d:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/hwid/core/datatype/DeviceInfo;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b:Ljava/lang/String;

    .line 182
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c:Ljava/lang/String;

    .line 183
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a:Ljava/lang/String;

    .line 184
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 185
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 188
    :cond_3
    goto :goto_0

    .line 189
    :cond_4
    const/4 v0, 0x0

    return v0

    .line 192
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public setDeviceAliasName(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->d:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setDeviceIdInDeviceInfo(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public setDeviceType(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setTerminalType(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setmFrequentlyUsed(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->g:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public setmLoginTime(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->e:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public setmLogoutTime(Ljava/lang/String;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->f:Ljava/lang/String;

    .line 131
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 197
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    const-string v0, "{\'mDeviceAliasName\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    const-string v0, ",\'mDeviceID\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    const-string v0, ",\'mTerminalType\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    const-string v0, ",\'mDeviceType\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    const-string v0, ",\'mLoginTime\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    const-string v0, ",\'mLogoutTime\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    const-string v0, ",\'mFrequentlyUsed\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/DeviceInfo;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 163
    return-void
.end method

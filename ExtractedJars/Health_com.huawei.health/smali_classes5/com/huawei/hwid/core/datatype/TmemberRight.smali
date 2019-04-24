.class public Lcom/huawei/hwid/core/datatype/TmemberRight;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/TmemberRight;>;"
        }
    .end annotation
.end field

.field public static final TAG_DEVICEID:Ljava/lang/String; = "deviceId"

.field public static final TAG_DEVICEID2:Ljava/lang/String; = "deviceID2"

.field public static final TAG_DEVICETYPE:Ljava/lang/String; = "deviceType"

.field public static final TAG_EXPIREDDATE:Ljava/lang/String; = "expiredDate"

.field public static final TAG_MEMBERBINDTIME:Ljava/lang/String; = "memberBindTime"

.field public static final TAG_RIGHTSID:Ljava/lang/String; = "rightsID"

.field public static final TAG_TERMINALTYPE:Ljava/lang/String; = "terminalType"

.field public static final TAG_USERID:Ljava/lang/String; = "userID"


# instance fields
.field private a:J

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 253
    new-instance v0, Lcom/huawei/hwid/core/datatype/TmemberRight$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/TmemberRight$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/datatype/TmemberRight;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/TmemberRight;I)I
    .locals 0

    .line 14
    iput p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->b:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/TmemberRight;J)J
    .locals 0

    .line 14
    iput-wide p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->a:J

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/TmemberRight;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->c:Ljava/lang/String;

    return-object p1
.end method

.method public static a(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/TmemberRight;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 157
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 158
    :cond_0
    return-void

    .line 160
    :cond_1
    const-string v0, "userID"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 161
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hwid/core/datatype/TmemberRight;->a(J)V

    goto/16 :goto_0

    .line 162
    :cond_2
    const-string v0, "deviceType"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 164
    :try_start_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/TmemberRight;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    goto/16 :goto_0

    .line 165
    :catch_0
    move-exception v2

    .line 166
    const-string v0, "TmemberRight"

    const-string v1, "setDeviceType Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    goto/16 :goto_0

    .line 169
    :cond_3
    const-string v0, "deviceId"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 170
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/TmemberRight;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 171
    :cond_4
    const-string v0, "deviceID2"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 172
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/TmemberRight;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 173
    :cond_5
    const-string v0, "terminalType"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 174
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/TmemberRight;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 175
    :cond_6
    const-string v0, "rightsID"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 176
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/TmemberRight;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 182
    :cond_7
    const-string v0, "memberBindTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 183
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/TmemberRight;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 184
    :cond_8
    const-string v0, "expiredDate"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 194
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/TmemberRight;->f(Ljava/lang/String;)V

    goto :goto_0

    .line 196
    :cond_9
    const-string v0, "TmemberRight"

    const-string v1, "in getTmemberRightTag nodeName"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/TmemberRight;I)I
    .locals 0

    .line 14
    iput p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->f:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/TmemberRight;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/hwid/core/datatype/TmemberRight;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/hwid/core/datatype/TmemberRight;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->g:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/hwid/core/datatype/TmemberRight;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->h:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->b:I

    .line 48
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 40
    iput-wide p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->a:J

    .line 41
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->c:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->d:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->e:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    .line 83
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->f:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    goto :goto_0

    .line 84
    :catch_0
    move-exception v2

    .line 85
    const-string v0, "TmemberRight"

    const-string v1, "setRightsID except"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    :goto_0
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 238
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->g:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 4

    .line 103
    const-string v2, ""

    .line 105
    const-string v0, "yyyy-MM-dd"

    const-string v1, "yyyyMMdd"

    :try_start_0
    invoke-static {p1, v0, v1}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 108
    goto :goto_0

    .line 106
    :catch_0
    move-exception v3

    .line 107
    const-string v0, "TmemberRight"

    const-string v1, "changeTimeFormat Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :goto_0
    iput-object v2, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->h:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 243
    iget-wide v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 244
    iget v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 245
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 248
    iget v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 249
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/TmemberRight;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 251
    return-void
.end method

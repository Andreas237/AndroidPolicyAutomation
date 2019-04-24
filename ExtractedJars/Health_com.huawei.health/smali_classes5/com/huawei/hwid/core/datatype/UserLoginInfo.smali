.class public Lcom/huawei/hwid/core/datatype/UserLoginInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/UserLoginInfo;>;"
        }
    .end annotation
.end field

.field public static final TAG_LASTLOGINTIME:Ljava/lang/String; = "lastLoginTime"

.field public static final TAG_LAST_LOGINIP:Ljava/lang/String; = "lastLoginIP"

.field public static final TAG_REGISTERCLIENT_IP:Ljava/lang/String; = "registerClientIP"

.field public static final TAG_REGISTERFROM:Ljava/lang/String; = "registerFrom"

.field public static final TAG_REGISTERTIME:Ljava/lang/String; = "registerTime"

.field public static final TAG_REGISTER_CLIENTTYPE:Ljava/lang/String; = "registerClientType"

.field public static final TAG_UNREGISTERTIME:Ljava/lang/String; = "unRegisterTime"

.field public static final TAG_USER_ID:Ljava/lang/String; = "userID"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 137
    new-instance v0, Lcom/huawei/hwid/core/datatype/UserLoginInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->h:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->a:Ljava/lang/String;

    .line 62
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->d:Ljava/lang/String;

    return-object p1
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->b:Ljava/lang/String;

    .line 70
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->f:Ljava/lang/String;

    return-object p1
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->c:Ljava/lang/String;

    .line 78
    return-void
.end method

.method static synthetic d(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->e:Ljava/lang/String;

    return-object p1
.end method

.method private d(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->d:Ljava/lang/String;

    .line 86
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->g:Ljava/lang/String;

    return-object p1
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->e:Ljava/lang/String;

    .line 94
    return-void
.end method

.method static synthetic f(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->b:Ljava/lang/String;

    return-object p1
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->f:Ljava/lang/String;

    .line 102
    return-void
.end method

.method static synthetic g(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->c:Ljava/lang/String;

    return-object p1
.end method

.method private g(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->g:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public static getUserLoginInfoInTag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 158
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 159
    :cond_0
    return-void

    .line 161
    :cond_1
    const-string v0, "userID"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 162
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 163
    :cond_2
    const-string v0, "registerTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 164
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 165
    :cond_3
    const-string v0, "unRegisterTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 166
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 167
    :cond_4
    const-string v0, "lastLoginTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 168
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 169
    :cond_5
    const-string v0, "registerClientType"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 170
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 171
    :cond_6
    const-string v0, "lastLoginIP"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 172
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->h(Ljava/lang/String;)V

    goto :goto_0

    .line 173
    :cond_7
    const-string v0, "registerClientIP"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 174
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->f(Ljava/lang/String;)V

    goto :goto_0

    .line 175
    :cond_8
    const-string v0, "registerFrom"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 176
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->g(Ljava/lang/String;)V

    .line 178
    :cond_9
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->a:Ljava/lang/String;

    return-object p1
.end method

.method private h(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->h:Ljava/lang/String;

    .line 118
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 122
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 135
    return-void
.end method

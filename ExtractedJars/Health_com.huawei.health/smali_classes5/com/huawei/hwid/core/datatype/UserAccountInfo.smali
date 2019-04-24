.class public Lcom/huawei/hwid/core/datatype/UserAccountInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/UserAccountInfo;>;"
        }
    .end annotation
.end field

.field public static final TAG_ACCOUNTVALID_STATUS:Ljava/lang/String; = "accountValidStatus"

.field public static final TAG_ACCOUNT_STATE:Ljava/lang/String; = "accountState"

.field public static final TAG_ACCOUNT_TYPE:Ljava/lang/String; = "accountType"

.field public static final TAG_MEMBERRIGHT:Ljava/lang/String; = "memberRight"

.field public static final TAG_MEMBERRIGHTLIST:Ljava/lang/String; = "memberRightList"

.field public static final TAG_MOBILEPHONE:Ljava/lang/String; = "mobilePhone"

.field public static final TAG_MOBILE_PHONE_STATE:Ljava/lang/String; = "mobilePhoneState"

.field public static final TAG_UPDATE_TIME:Ljava/lang/String; = "updateTime"

.field public static final TAG_USERACCINFO:Ljava/lang/String; = "userAcctInfo"

.field public static final TAG_USERACCTINFO_LIST:Ljava/lang/String; = "userAcctInfoList"

.field public static final TAG_USEREMAIL:Ljava/lang/String; = "userEMail"

.field public static final TAG_USER_ACCOUNT:Ljava/lang/String; = "userAccount"

.field public static final TAG_USER_EMAIL_STATE:Ljava/lang/String; = "emailState"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 219
    new-instance v0, Lcom/huawei/hwid/core/datatype/UserAccountInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->a:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->d:Ljava/lang/String;

    .line 98
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->b:Ljava/lang/String;

    return-object p1
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->e:Ljava/lang/String;

    .line 106
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->c:Ljava/lang/String;

    return-object p1
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->f:Ljava/lang/String;

    .line 114
    return-void
.end method

.method static synthetic d(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->d:Ljava/lang/String;

    return-object p1
.end method

.method private d(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->g:Ljava/lang/String;

    .line 122
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->e:Ljava/lang/String;

    return-object p1
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->h:Ljava/lang/String;

    .line 130
    return-void
.end method

.method static synthetic f(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->f:Ljava/lang/String;

    return-object p1
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->i:Ljava/lang/String;

    .line 138
    return-void
.end method

.method static synthetic g(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->g:Ljava/lang/String;

    return-object p1
.end method

.method public static getUserAccInfoInTag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 195
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 196
    :cond_0
    return-void

    .line 198
    :cond_1
    const-string v0, "accountState"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 199
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->setAccountState(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 200
    :cond_2
    const-string v0, "accountType"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 201
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->setAccountType(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 202
    :cond_3
    const-string v0, "accountValidStatus"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 203
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 204
    :cond_4
    const-string v0, "updateTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 205
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 206
    :cond_5
    const-string v0, "userAccount"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 207
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->setUserAccount(Ljava/lang/String;)V

    goto :goto_0

    .line 208
    :cond_6
    const-string v0, "userEMail"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 209
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 210
    :cond_7
    const-string v0, "mobilePhone"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 211
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 212
    :cond_8
    const-string v0, "emailState"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 213
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 214
    :cond_9
    const-string v0, "mobilePhoneState"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 215
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->f(Ljava/lang/String;)V

    .line 217
    :cond_a
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->h:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic i(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->i:Ljava/lang/String;

    return-object p1
.end method

.method public static setUserAccInfoInTag(Lorg/xmlpull/v1/XmlSerializer;Lcom/huawei/hwid/core/datatype/UserAccountInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 147
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 148
    :cond_0
    return-void

    .line 150
    :cond_1
    const-string v0, "accountType"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getAccountType()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string v0, "userAccount"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getUserAccount()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 141
    const/4 v0, 0x0

    return v0
.end method

.method public getAccountState()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getAccountType()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getUserAccount()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public isObjectEquals(Ljava/lang/Object;)Z
    .locals 3

    .line 174
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 175
    const/4 v0, 0x0

    return v0

    .line 177
    :cond_0
    instance-of v0, p1, Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    if-eqz v0, :cond_3

    .line 179
    if-ne p0, p1, :cond_1

    .line 180
    const/4 v0, 0x1

    return v0

    .line 182
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    .line 183
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->g:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 184
    const/4 v0, 0x0

    return v0

    .line 186
    :cond_2
    goto :goto_0

    .line 187
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 189
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public setAccountState(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->c:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setAccountType(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->a:Ljava/lang/String;

    .line 74
    return-void
.end method

.method public setUserAccount(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->b:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 164
    return-void
.end method

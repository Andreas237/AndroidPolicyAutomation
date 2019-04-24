.class public Lcom/huawei/hwid/core/datatype/ChildrenInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/ChildrenInfo;>;"
        }
    .end annotation
.end field

.field public static final TAG_ACCOUNT_LOGIN_USER_NAME:Ljava/lang/String; = "loginUserName"

.field public static final TAG_ACCOUNT_NAME:Ljava/lang/String; = "accountname"

.field public static final TAG_ACCOUNT_NICK_NAME:Ljava/lang/String; = "nickName"

.field public static final TAG_BIRTH_DATE:Ljava/lang/String; = "birthDate"

.field public static final TAG_CHILDREN_INFO:Ljava/lang/String; = "children"

.field public static final TAG_CHILDREN_INFO_LIST:Ljava/lang/String; = "childrenList"

.field public static final TAG_CHILDREN_USER_ID:Ljava/lang/String; = "childrenUserID"

.field public static final TAG_HEAD_PICTURE_URL:Ljava/lang/String; = "headPictureURL"

.field public static final TAG_UNI_NICK_NAME:Ljava/lang/String; = "uniquelyNickname"


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

    .line 170
    new-instance v0, Lcom/huawei/hwid/core/datatype/ChildrenInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->a:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->a:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public static a(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 125
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 126
    :cond_0
    return-void

    .line 128
    :cond_1
    const-string v0, "childrenUserID"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 130
    :cond_2
    const-string v0, "birthDate"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 131
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 132
    :cond_3
    const-string v0, "uniquelyNickname"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 133
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 134
    :cond_4
    const-string v0, "headPictureURL"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 135
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 136
    :cond_5
    const-string v0, "accountname"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 137
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 138
    :cond_6
    const-string v0, "nickName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 139
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 140
    :cond_7
    const-string v0, "loginUserName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 141
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->f(Ljava/lang/String;)V

    .line 144
    :cond_8
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->b:Ljava/lang/String;

    return-object p1
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->b:Ljava/lang/String;

    .line 51
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->c:Ljava/lang/String;

    return-object p1
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->c:Ljava/lang/String;

    .line 55
    return-void
.end method

.method static synthetic d(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->d:Ljava/lang/String;

    return-object p1
.end method

.method private d(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->d:Ljava/lang/String;

    .line 63
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->e:Ljava/lang/String;

    return-object p1
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->f:Ljava/lang/String;

    .line 71
    return-void
.end method

.method static synthetic f(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->f:Ljava/lang/String;

    return-object p1
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->g:Ljava/lang/String;

    .line 79
    return-void
.end method

.method static synthetic g(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->g:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 167
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    const-string v0, "{\'childrenUserID\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    const-string v0, ",\'birthDate\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    const-string v0, ",\'uniquelyNickname\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    const-string v0, ",\'headPictureURL\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    const-string v0, ",\'accountName\':"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 89
    return-void
.end method

.class public Lcom/huawei/hwid/core/datatype/UserInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;


# static fields
.field public static final ADDRESS:Ljava/lang/String; = "address"

.field public static final BIRTHDATE:Ljava/lang/String; = "birthDate"

.field public static final CITY:Ljava/lang/String; = "city"

.field public static final CLOUDACCOUNT:Ljava/lang/String; = "cloudAccount"

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/UserInfo;>;"
        }
    .end annotation
.end field

.field public static final CTFCODE:Ljava/lang/String; = "ctfCode"

.field public static final CTFTYPE:Ljava/lang/String; = "ctfType"

.field public static final CTFVERIFYFLAG:Ljava/lang/String; = "ctfVerifyFlag"

.field public static final FIRSTNAME:Ljava/lang/String; = "firstName"

.field public static final GENDER:Ljava/lang/String; = "gender"

.field public static final GUARDIAN_ACCOUNT:Ljava/lang/String; = "guardianAccount"

.field public static final GUARDIAN_USER_ID:Ljava/lang/String; = "guardianUserID"

.field public static final HEADPICTUREURL:Ljava/lang/String; = "headPictureURL"

.field public static final INVITER:Ljava/lang/String; = "Inviter"

.field public static final INVITER_USERID:Ljava/lang/String; = "InviterUserID"

.field public static final LANGUAGECODE:Ljava/lang/String; = "languageCode"

.field public static final LASTNAME:Ljava/lang/String; = "lastName"

.field public static final LOGIN_NOTICE:Ljava/lang/String; = "loginnotice"

.field public static final LOGIN_USER_NAME:Ljava/lang/String; = "loginUserName"

.field public static final LOGIN_USER_NAME_FLAG:Ljava/lang/String; = "loginUserNameFlag"

.field public static final NATIONALCODE:Ljava/lang/String; = "nationalCode"

.field public static final NICKNAME:Ljava/lang/String; = "nickName"

.field public static final OCCUPATION:Ljava/lang/String; = "occupation"

.field public static final PASSWORDANWSER:Ljava/lang/String; = "passwordAnswer"

.field public static final PASSWORDPROMPT:Ljava/lang/String; = "passwordPrompt"

.field public static final PROVINCE:Ljava/lang/String; = "province"

.field public static final RESET_PASSWD_MODE:Ljava/lang/String; = "resetPasswdMode"

.field public static final SERVICEFLAG:Ljava/lang/String; = "ServiceFlag"

.field public static final TWO_STEP_TIME:Ljava/lang/String; = "twoStepTime"

.field public static final TWO_STEP_VERIFY:Ljava/lang/String; = "twoStepVerify"

.field public static final UNIQUE_NICKNAME:Ljava/lang/String; = "uniquelyNickname"

.field public static final UPDATE_TIME:Ljava/lang/String; = "updateTime"

.field public static final USERSIGN:Ljava/lang/String; = "userSignature"

.field public static final USERSTATE:Ljava/lang/String; = "userState"

.field public static final USERVALID_STATUS:Ljava/lang/String; = "userValidStatus"

.field public static final USER_STATUS_FLAGS:Ljava/lang/String; = "userStatusFlags"


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private J:Ljava/lang/String;

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 696
    new-instance v0, Lcom/huawei/hwid/core/datatype/UserInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/UserInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/datatype/UserInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 222
    return-void
.end method

.method static synthetic A(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->A:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic B(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->B:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic C(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->D:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic D(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->C:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic E(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->E:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic F(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->F:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic G(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->I:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic H(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->G:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic I(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->H:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic J(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->J:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->i:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->h:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->n:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->q:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic f(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->g:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic g(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->k:Ljava/lang/String;

    return-object p1
.end method

.method public static getUserInfoIntag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 674
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 675
    :cond_0
    return-void

    .line 678
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/core/datatype/UserInfo;->setInfo1(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V

    .line 679
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/core/datatype/UserInfo;->setInfo2(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V

    .line 680
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/core/datatype/UserInfo;->setInfo3(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V

    .line 681
    return-void
.end method

.method static synthetic h(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic i(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic j(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->l:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic k(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic l(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic m(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->j:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic n(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->p:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic o(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->o:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic p(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->m:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic q(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->r:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic r(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->f:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic s(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->s:Ljava/lang/String;

    return-object p1
.end method

.method public static setInfo1(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 586
    const-string v0, "nickName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 587
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setNickName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 588
    :cond_0
    const-string v0, "uniquelyNickname"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 589
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUniqueNickName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 590
    :cond_1
    const-string v0, "languageCode"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 591
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLanguageCode(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 592
    :cond_2
    const-string v0, "firstName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 593
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setFirstName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 594
    :cond_3
    const-string v0, "lastName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 595
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLastName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 596
    :cond_4
    const-string v0, "userState"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 597
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUserState(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 598
    :cond_5
    const-string v0, "guardianAccount"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 599
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setGuardianAccount(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 600
    :cond_6
    const-string v0, "guardianUserID"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 601
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setGuardianUserID(Ljava/lang/String;)V

    goto :goto_0

    .line 602
    :cond_7
    const-string v0, "ctfCode"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 603
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setCtfCode(Ljava/lang/String;)V

    goto :goto_0

    .line 604
    :cond_8
    const-string v0, "ctfType"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 605
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setCtfType(Ljava/lang/String;)V

    goto :goto_0

    .line 606
    :cond_9
    const-string v0, "ctfVerifyFlag"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 607
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setCtfVerifyFlag(Ljava/lang/String;)V

    goto :goto_0

    .line 608
    :cond_a
    const-string v0, "userValidStatus"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 609
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUserValidStatus(Ljava/lang/String;)V

    goto :goto_0

    .line 610
    :cond_b
    const-string v0, "InviterUserID"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 611
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setInviterUserID(Ljava/lang/String;)V

    .line 613
    :cond_c
    :goto_0
    return-void
.end method

.method public static setInfo2(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 617
    const-string v0, "gender"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 618
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setGender(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 619
    :cond_0
    const-string v0, "birthDate"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 620
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setBirthDate(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 621
    :cond_1
    const-string v0, "address"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 622
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setAddress(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 623
    :cond_2
    const-string v0, "occupation"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 624
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setOccupation(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 625
    :cond_3
    const-string v0, "headPictureURL"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 626
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setHeadPictureURL(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 627
    :cond_4
    const-string v0, "nationalCode"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 628
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setNationalCode(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 629
    :cond_5
    const-string v0, "province"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 630
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setProvince(Ljava/lang/String;)V

    goto :goto_0

    .line 631
    :cond_6
    const-string v0, "city"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 632
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setCity(Ljava/lang/String;)V

    goto :goto_0

    .line 633
    :cond_7
    const-string v0, "passwordPrompt"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 634
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setPasswordPrompt(Ljava/lang/String;)V

    goto :goto_0

    .line 635
    :cond_8
    const-string v0, "passwordAnswer"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 636
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setPasswordAnwser(Ljava/lang/String;)V

    goto :goto_0

    .line 637
    :cond_9
    const-string v0, "cloudAccount"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 638
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setCloudAccount(Ljava/lang/String;)V

    goto :goto_0

    .line 639
    :cond_a
    const-string v0, "ServiceFlag"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 640
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setServiceFlag(Ljava/lang/String;)V

    .line 642
    :cond_b
    :goto_0
    return-void
.end method

.method public static setInfo3(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 646
    const-string v0, "Inviter"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 647
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setInviter(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 648
    :cond_0
    const-string v0, "updateTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 649
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUpdateTime(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 650
    :cond_1
    const-string v0, "loginUserName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 651
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLoginUserName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 652
    :cond_2
    const-string v0, "loginUserNameFlag"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 653
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLoginUserNameFlag(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 654
    :cond_3
    const-string v0, "userStatusFlags"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 655
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setuserStatusFlags(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 656
    :cond_4
    const-string v0, "twoStepVerify"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 657
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->settwoStepVerify(Ljava/lang/String;)V

    goto :goto_0

    .line 658
    :cond_5
    const-string v0, "twoStepTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 659
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->settwoStepTime(Ljava/lang/String;)V

    goto :goto_0

    .line 660
    :cond_6
    const-string v0, "resetPasswdMode"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 661
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setResetPasswdMode(Ljava/lang/String;)V

    goto :goto_0

    .line 662
    :cond_7
    const-string v0, "userSignature"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 663
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUserSign(Ljava/lang/String;)V

    goto :goto_0

    .line 664
    :cond_8
    const-string v0, "loginnotice"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 665
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLoginNotice(Ljava/lang/String;)V

    goto :goto_0

    .line 666
    :cond_9
    const-string v0, "srvNationalCode"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 667
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setServiceCountryCode(Ljava/lang/String;)V

    .line 669
    :cond_a
    :goto_0
    return-void
.end method

.method public static setUserInfoIntag(Lorg/xmlpull/v1/XmlSerializer;Lcom/huawei/hwid/core/datatype/UserInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 550
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 551
    :cond_0
    return-void

    .line 553
    :cond_1
    const-string v0, "uniquelyNickname"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getUniqueNickName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    const-string v0, "nickName"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    const-string v0, "languageCode"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getLanguageCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 556
    const-string v0, "firstName"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 557
    const-string v0, "lastName"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getLastName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    const-string v0, "userState"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getUserState()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    const-string v0, "gender"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    const-string v0, "birthDate"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    const-string v0, "address"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    const-string v0, "occupation"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getOccupation()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 563
    const-string v0, "headPictureURL"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getHeadPictureURL()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 564
    const-string v0, "nationalCode"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getNationalCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    const-string v0, "province"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getProvince()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    const-string v0, "city"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getCity()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    const-string v0, "passwordPrompt"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getPasswordPrompt()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    const-string v0, "passwordAnswer"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getPasswordAnwser()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    const-string v0, "cloudAccount"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getCloudAccount()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    const-string v0, "ServiceFlag"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getServiceFlag()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    const-string v0, "userValidStatus"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getUserValidStatus()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    const-string v0, "Inviter"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getInviter()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    const-string v0, "InviterUserID"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getInviterUserID()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    const-string v0, "updateTime"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getUpdateTime()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    const-string v0, "loginUserName"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getLoginUserName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    const-string v0, "loginUserNameFlag"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getLoginUserNameFlag()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 577
    const-string v0, "userSignature"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getUserSign()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 578
    const-string v0, "ctfCode"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getCtfCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    const-string v0, "ctfType"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getCtfType()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 580
    const-string v0, "ctfVerifyFlag"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getCtfVerifyFlag()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    const-string v0, "srvNationalCode"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getServiceCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    return-void
.end method

.method static synthetic t(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->t:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic u(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->u:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic v(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->v:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic w(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->w:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic x(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->x:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic y(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->y:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic z(Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->z:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 417
    const/4 v0, 0x0

    return v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getBirthDate()Ljava/lang/String;
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 329
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->n:Ljava/lang/String;

    return-object v0
.end method

.method public getCloudAccount()Ljava/lang/String;
    .locals 1

    .line 353
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->q:Ljava/lang/String;

    return-object v0
.end method

.method public getCtfCode()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->I:Ljava/lang/String;

    return-object v0
.end method

.method public getCtfType()Ljava/lang/String;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->G:Ljava/lang/String;

    return-object v0
.end method

.method public getCtfVerifyFlag()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->H:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getGender()Ljava/lang/String;
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getGuardianAccount()Ljava/lang/String;
    .locals 1

    .line 445
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->F:Ljava/lang/String;

    return-object v0
.end method

.method public getGuardianUserID()Ljava/lang/String;
    .locals 1

    .line 437
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->E:Ljava/lang/String;

    return-object v0
.end method

.method public getHeadPictureURL()Ljava/lang/String;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->k:Ljava/lang/String;

    return-object v0
.end method

.method public getInviter()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->u:Ljava/lang/String;

    return-object v0
.end method

.method public getInviterUserID()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->t:Ljava/lang/String;

    return-object v0
.end method

.method public getLanguageCode()Ljava/lang/String;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getLoginNotice()Ljava/lang/String;
    .locals 1

    .line 429
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->D:Ljava/lang/String;

    return-object v0
.end method

.method public getLoginUserName()Ljava/lang/String;
    .locals 1

    .line 369
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->w:Ljava/lang/String;

    return-object v0
.end method

.method public getLoginUserNameFlag()Ljava/lang/String;
    .locals 1

    .line 377
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->x:Ljava/lang/String;

    return-object v0
.end method

.method public getNationalCode()Ljava/lang/String;
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->l:Ljava/lang/String;

    return-object v0
.end method

.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getOccupation()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getPasswordAnwser()Ljava/lang/String;
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->p:Ljava/lang/String;

    return-object v0
.end method

.method public getPasswordPrompt()Ljava/lang/String;
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->o:Ljava/lang/String;

    return-object v0
.end method

.method public getProvince()Ljava/lang/String;
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getResetPasswdMode()Ljava/lang/String;
    .locals 1

    .line 409
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->B:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceCountryCode()Ljava/lang/String;
    .locals 1

    .line 465
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->J:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceFlag()Ljava/lang/String;
    .locals 1

    .line 361
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->r:Ljava/lang/String;

    return-object v0
.end method

.method public getUniqueNickName()Ljava/lang/String;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->v:Ljava/lang/String;

    return-object v0
.end method

.method public getUserSign()Ljava/lang/String;
    .locals 1

    .line 421
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->C:Ljava/lang/String;

    return-object v0
.end method

.method public getUserState()Ljava/lang/String;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getUserType()I
    .locals 1

    .line 457
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->E:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->F:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 458
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 460
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public getUserValidStatus()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->s:Ljava/lang/String;

    return-object v0
.end method

.method public gettwoStepTime()Ljava/lang/String;
    .locals 1

    .line 401
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->A:Ljava/lang/String;

    return-object v0
.end method

.method public gettwoStepVerify()Ljava/lang/String;
    .locals 1

    .line 393
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->z:Ljava/lang/String;

    return-object v0
.end method

.method public getuserStatusFlags()Ljava/lang/String;
    .locals 1

    .line 385
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->y:Ljava/lang/String;

    return-object v0
.end method

.method public isObjectEquals(Ljava/lang/Object;)Z
    .locals 3

    .line 521
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 522
    const/4 v0, 0x0

    return v0

    .line 524
    :cond_0
    instance-of v0, p1, Lcom/huawei/hwid/core/datatype/UserInfo;

    if-eqz v0, :cond_8

    .line 525
    if-ne p0, p1, :cond_1

    .line 526
    const/4 v0, 0x1

    return v0

    .line 528
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 529
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 530
    const/4 v0, 0x0

    return v0

    .line 531
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getLoginUserName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;->getLoginUserName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 532
    const/4 v0, 0x0

    return v0

    .line 533
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getLoginUserNameFlag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;->getLoginUserNameFlag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 534
    const/4 v0, 0x0

    return v0

    .line 535
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 536
    const/4 v0, 0x0

    return v0

    .line 537
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 538
    const/4 v0, 0x0

    return v0

    .line 539
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getNationalCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;->getNationalCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/j;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 540
    const/4 v0, 0x0

    return v0

    .line 542
    :cond_7
    goto :goto_0

    .line 543
    :cond_8
    const/4 v0, 0x0

    return v0

    .line 545
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->i:Ljava/lang/String;

    .line 294
    return-void
.end method

.method public setBirthDate(Ljava/lang/String;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->h:Ljava/lang/String;

    .line 286
    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 333
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->n:Ljava/lang/String;

    .line 334
    return-void
.end method

.method public setCloudAccount(Ljava/lang/String;)V
    .locals 0

    .line 357
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->q:Ljava/lang/String;

    .line 358
    return-void
.end method

.method public setCtfCode(Ljava/lang/String;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->I:Ljava/lang/String;

    .line 170
    return-void
.end method

.method public setCtfType(Ljava/lang/String;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->G:Ljava/lang/String;

    .line 178
    return-void
.end method

.method public setCtfVerifyFlag(Ljava/lang/String;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->H:Ljava/lang/String;

    .line 186
    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->d:Ljava/lang/String;

    .line 254
    return-void
.end method

.method public setGender(Ljava/lang/String;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->g:Ljava/lang/String;

    .line 278
    return-void
.end method

.method public setGuardianAccount(Ljava/lang/String;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->F:Ljava/lang/String;

    .line 450
    return-void
.end method

.method public setGuardianUserID(Ljava/lang/String;)V
    .locals 0

    .line 441
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->E:Ljava/lang/String;

    .line 442
    return-void
.end method

.method public setHeadPictureURL(Ljava/lang/String;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->k:Ljava/lang/String;

    .line 310
    return-void
.end method

.method public setInviter(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->u:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public setInviterUserID(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->t:Ljava/lang/String;

    .line 202
    return-void
.end method

.method public setLanguageCode(Ljava/lang/String;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->c:Ljava/lang/String;

    .line 246
    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->e:Ljava/lang/String;

    .line 262
    return-void
.end method

.method public setLoginNotice(Ljava/lang/String;)V
    .locals 0

    .line 433
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->D:Ljava/lang/String;

    .line 434
    return-void
.end method

.method public setLoginUserName(Ljava/lang/String;)V
    .locals 0

    .line 373
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->w:Ljava/lang/String;

    .line 374
    return-void
.end method

.method public setLoginUserNameFlag(Ljava/lang/String;)V
    .locals 0

    .line 381
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->x:Ljava/lang/String;

    .line 382
    return-void
.end method

.method public setNationalCode(Ljava/lang/String;)V
    .locals 0

    .line 317
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->l:Ljava/lang/String;

    .line 318
    return-void
.end method

.method public setNickName(Ljava/lang/String;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->a:Ljava/lang/String;

    .line 230
    return-void
.end method

.method public setOccupation(Ljava/lang/String;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->j:Ljava/lang/String;

    .line 302
    return-void
.end method

.method public setPasswordAnwser(Ljava/lang/String;)V
    .locals 0

    .line 349
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->p:Ljava/lang/String;

    .line 350
    return-void
.end method

.method public setPasswordPrompt(Ljava/lang/String;)V
    .locals 0

    .line 341
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->o:Ljava/lang/String;

    .line 342
    return-void
.end method

.method public setProvince(Ljava/lang/String;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->m:Ljava/lang/String;

    .line 326
    return-void
.end method

.method public setResetPasswdMode(Ljava/lang/String;)V
    .locals 0

    .line 413
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->B:Ljava/lang/String;

    .line 414
    return-void
.end method

.method public setServiceCountryCode(Ljava/lang/String;)V
    .locals 0

    .line 469
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->J:Ljava/lang/String;

    .line 470
    return-void
.end method

.method public setServiceFlag(Ljava/lang/String;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->r:Ljava/lang/String;

    .line 366
    return-void
.end method

.method public setUniqueNickName(Ljava/lang/String;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->b:Ljava/lang/String;

    .line 238
    return-void
.end method

.method public setUpdateTime(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->v:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public setUserSign(Ljava/lang/String;)V
    .locals 0

    .line 425
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->C:Ljava/lang/String;

    .line 426
    return-void
.end method

.method public setUserState(Ljava/lang/String;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->f:Ljava/lang/String;

    .line 270
    return-void
.end method

.method public setUserValidStatus(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->s:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public settwoStepTime(Ljava/lang/String;)V
    .locals 0

    .line 405
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->A:Ljava/lang/String;

    .line 406
    return-void
.end method

.method public settwoStepVerify(Ljava/lang/String;)V
    .locals 0

    .line 397
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->z:Ljava/lang/String;

    .line 398
    return-void
.end method

.method public setuserStatusFlags(Ljava/lang/String;)V
    .locals 0

    .line 389
    iput-object p1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->y:Ljava/lang/String;

    .line 390
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 685
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserInfo [mNickName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mUniqueNickName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLanguageCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mFirstName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLastName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mUserState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mGender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mBirthDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mOccupation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mHeadPictureURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mNationalCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mProvince="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mPasswordPrompt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mscrtdanws="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCloudAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mServiceFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mUserValidStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mInviterUserID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mInviter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mUpdateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLoginUserName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLoginUserNameFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", muserStatusFlags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mtwoStepVerify="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mtwoStepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mResetPasswdMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mUserSign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLoginNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mGuardianUserID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mGuardianAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCtfType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCtfVerifyFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCtfCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mServiceCountryCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->J:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 474
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 475
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 476
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 478
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 479
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 484
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 487
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->r:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->s:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->t:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 494
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->u:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 495
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->v:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 498
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 499
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 500
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->A:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 501
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->B:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 502
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->D:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 503
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->C:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 504
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 505
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 506
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 508
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/hwid/core/datatype/UserInfo;->J:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 511
    return-void
.end method

.class public final enum Lio/branch/referral/SharingHelper$SHARE_WITH;
.super Ljava/lang/Enum;
.source "SharingHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/SharingHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SHARE_WITH"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/branch/referral/SharingHelper$SHARE_WITH;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum EMAIL:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum FACEBOOK:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum FACEBOOK_MESSENGER:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum FLICKR:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum GMAIL:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum GOOGLE_DOC:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum HANGOUT:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum INSTAGRAM:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum MESSAGE:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum PINTEREST:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum SNAPCHAT:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum TWITTER:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum WECHAT:Lio/branch/referral/SharingHelper$SHARE_WITH;

.field public static final enum WHATS_APP:Lio/branch/referral/SharingHelper$SHARE_WITH;


# instance fields
.field private name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 13
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "FACEBOOK"

    const-string v2, "com.facebook.katana"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->FACEBOOK:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 14
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "FACEBOOK_MESSENGER"

    const-string v2, "com.facebook.orca"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->FACEBOOK_MESSENGER:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 15
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "TWITTER"

    const-string v2, "com.twitter.android"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->TWITTER:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 16
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "MESSAGE"

    const-string v2, ".mms"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->MESSAGE:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 17
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "EMAIL"

    const-string v2, "com.google.android.email"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->EMAIL:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 18
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "FLICKR"

    const-string v2, "com.yahoo.mobile.client.android.flickr"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->FLICKR:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 19
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "GOOGLE_DOC"

    const-string v2, "com.google.android.apps.docs"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->GOOGLE_DOC:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 20
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "WHATS_APP"

    const-string v2, "com.whatsapp"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->WHATS_APP:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 21
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "PINTEREST"

    const-string v2, "com.pinterest"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->PINTEREST:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 22
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "HANGOUT"

    const-string v2, "com.google.android.talk"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->HANGOUT:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 23
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "INSTAGRAM"

    const-string v2, "com.instagram.android"

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->INSTAGRAM:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 24
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "WECHAT"

    const-string v2, "jom.tencent.mm"

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->WECHAT:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 25
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "SNAPCHAT"

    const-string v2, "com.snapchat.android"

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->SNAPCHAT:Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 26
    new-instance v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    const-string v1, "GMAIL"

    const-string v2, "com.google.android.gm"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/SharingHelper$SHARE_WITH;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->GMAIL:Lio/branch/referral/SharingHelper$SHARE_WITH;

    const/16 v0, 0xe

    .line 12
    new-array v0, v0, [Lio/branch/referral/SharingHelper$SHARE_WITH;

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->FACEBOOK:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v3

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->FACEBOOK_MESSENGER:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v4

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->TWITTER:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v5

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->MESSAGE:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v6

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->EMAIL:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v7

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->FLICKR:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v8

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->GOOGLE_DOC:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v9

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->WHATS_APP:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v10

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->PINTEREST:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v11

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->HANGOUT:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v12

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->INSTAGRAM:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v13

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->WECHAT:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v14

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->SNAPCHAT:Lio/branch/referral/SharingHelper$SHARE_WITH;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/SharingHelper$SHARE_WITH;->GMAIL:Lio/branch/referral/SharingHelper$SHARE_WITH;

    aput-object v1, v0, v15

    sput-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->$VALUES:[Lio/branch/referral/SharingHelper$SHARE_WITH;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const-string p1, ""

    .line 28
    iput-object p1, p0, Lio/branch/referral/SharingHelper$SHARE_WITH;->name:Ljava/lang/String;

    .line 31
    iput-object p3, p0, Lio/branch/referral/SharingHelper$SHARE_WITH;->name:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/branch/referral/SharingHelper$SHARE_WITH;
    .locals 1

    .line 12
    const-class v0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/branch/referral/SharingHelper$SHARE_WITH;

    return-object p0
.end method

.method public static values()[Lio/branch/referral/SharingHelper$SHARE_WITH;
    .locals 1

    .line 12
    sget-object v0, Lio/branch/referral/SharingHelper$SHARE_WITH;->$VALUES:[Lio/branch/referral/SharingHelper$SHARE_WITH;

    invoke-virtual {v0}, [Lio/branch/referral/SharingHelper$SHARE_WITH;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/branch/referral/SharingHelper$SHARE_WITH;

    return-object v0
.end method


# virtual methods
.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lio/branch/referral/SharingHelper$SHARE_WITH;->name:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lio/branch/referral/SharingHelper$SHARE_WITH;->name:Ljava/lang/String;

    return-object v0
.end method

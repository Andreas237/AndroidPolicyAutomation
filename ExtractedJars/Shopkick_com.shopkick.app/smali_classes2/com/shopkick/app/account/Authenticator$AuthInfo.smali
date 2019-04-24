.class public Lcom/shopkick/app/account/Authenticator$AuthInfo;
.super Ljava/lang/Object;
.source "Authenticator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/Authenticator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AuthInfo"
.end annotation


# instance fields
.field private authCode:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private facebookAccessToken:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private googleEmail:Ljava/lang/String;

.field private googleSignInIdToken:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private password:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 840
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;
    .locals 0

    .line 840
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->email:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;
    .locals 0

    .line 840
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->password:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;
    .locals 0

    .line 840
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;
    .locals 0

    .line 840
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->firstName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;
    .locals 0

    .line 840
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->authCode:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;
    .locals 0

    .line 840
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->facebookAccessToken:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$502(Lcom/shopkick/app/account/Authenticator$AuthInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 840
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->facebookAccessToken:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;
    .locals 0

    .line 840
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->googleSignInIdToken:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$602(Lcom/shopkick/app/account/Authenticator$AuthInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 840
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->googleSignInIdToken:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$700(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;
    .locals 0

    .line 840
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->googleEmail:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$702(Lcom/shopkick/app/account/Authenticator$AuthInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 840
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->googleEmail:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public setAuthCode(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;
    .locals 0

    .line 903
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->authCode:Ljava/lang/String;

    return-object p0
.end method

.method public setEmail(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;
    .locals 0

    .line 888
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->email:Ljava/lang/String;

    return-object p0
.end method

.method public setFirstName(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;
    .locals 0

    .line 883
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->firstName:Ljava/lang/String;

    return-object p0
.end method

.method public setGoogleEmail(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;
    .locals 0

    .line 898
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->googleEmail:Ljava/lang/String;

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;
    .locals 0

    .line 878
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->name:Ljava/lang/String;

    return-object p0
.end method

.method public setPassword(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;
    .locals 0

    .line 893
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator$AuthInfo;->password:Ljava/lang/String;

    return-object p0
.end method
